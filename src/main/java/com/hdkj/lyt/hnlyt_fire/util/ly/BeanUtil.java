package com.hdkj.lyt.hnlyt_fire.util.ly;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class BeanUtil {
	/**
	 * 通过实体类获取动态拼接的修改sql语句
	 * @param bean
	 * @param tb_tableName
	 * @param pKey
	 * @return String
	 * @date 2018-3-23
	 */
	public static String getUpdateSqlByClass(Object bean,String tb_tableName,String pKey) {
        String pSql=null;
        StringBuilder params=new StringBuilder();
        StringBuilder pWhere=new StringBuilder();
        if (bean == null) {
            return pSql;
        }
        Class<?> cls = bean.getClass();
       // Method[] methods = cls.getDeclaredMethods();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            try {
                String fieldGetName = parGetName(field.getName());
                /*if (!checkGetMet(methods, fieldGetName)) {
                    continue;
                }*/
                Method fieldGetMet = cls.getMethod(fieldGetName);
                Object fieldVal = fieldGetMet.invoke(bean);
               // System.out.println(field.toGenericString());
                if (fieldVal != null) {
                    if (!"".equals(fieldVal)) {
                        if(pKey.equals(field.getName())){
                        	pWhere.append("["+pKey+"]='"+fieldVal+"'");
                        }else{
                        	 params.append("["+field.getName()+"]='"+fieldVal.toString()+"',");
                        }
                        
                    } else {
                       // result = false;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }
        pSql="update "+tb_tableName+" set "+params.substring(0, params.length()-1)+" where "+pWhere;
        return pSql;
    }
	/**
	 * 通过实体类获取动态拼接的插入语句
	 * @param bean
	 * @param tb_tableName
	 * @return
	 * @return String
	 * @date 2018-3-23
	 */
	public static String getInsertSqlByClass(Object bean,String tb_tableName) {
        String pSql=null;
        StringBuilder params=new StringBuilder();
        StringBuilder pValue=new StringBuilder();
        if (bean == null) {
            return pSql;
        }
        Class<?> cls = bean.getClass();
        //Method[] methods = cls.getDeclaredMethods();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            try {
                String fieldGetName = parGetName(field.getName());
                /*if (!checkGetMet(methods, fieldGetName)) {
                    continue;
                }*/
                Method fieldGetMet = cls.getMethod(fieldGetName);
                Object fieldVal = fieldGetMet.invoke(bean);
               // System.out.println(field.toGenericString());
                if (fieldVal != null) {
                    if (!"".equals(fieldVal)) {
                        params.append("[").append(field.getName()+"],");
                        pValue.append("'"+fieldVal+"',");
                    } else {
                       // result = false;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }
        pSql="insert into "+tb_tableName+"("+params.substring(0, params.length()-1)+")values("+pValue.substring(0, pValue.length()-1)+")";
        return pSql;
    }

	/**
	 * 检查值是否为空
	 * @param bean
	 * @return boolean
	 * @date 2018-3-23
	 */
	 public static boolean checkFieldValueNull(Object bean) {
	        boolean result = true;
	        if (bean == null) {
	            return true;
	        }
	        Class<?> cls = bean.getClass();
	        Method[] methods = cls.getDeclaredMethods();
	        Field[] fields = cls.getDeclaredFields();
	        for (Field field : fields) {
	            try {
	                String fieldGetName = parGetName(field.getName());
	                if (!checkGetMet(methods, fieldGetName)) {
	                    continue;
	                }
	                Method fieldGetMet = cls.getMethod(fieldGetName);
	                Object fieldVal = fieldGetMet.invoke(bean);
	                if (fieldVal != null) {
                        result = "".equals(fieldVal);
	                }
	            } catch (Exception e) {
	                continue;
	            }
	        }
	        return result;
	    }


	    /**
	     * 拼接某属性的 get方法
	     *
	     * @param fieldName
	     * @return String
	     */
	    public static String parGetName(String fieldName) {
	        if (null == fieldName || "".equals(fieldName)) {
	            return null;
	        }
	        int startIndex = 0;
	        if (fieldName.charAt(0) == '_')
	            startIndex = 1;
	        return "get"
	                + fieldName.substring(startIndex, startIndex + 1).toUpperCase()
	                + fieldName.substring(startIndex + 1);
	    }

	    /**
	     * 判断是否存在某属性的 get方法
	     *
	     * @param methods
	     * @param fieldGetMet
	     * @return boolean
	     */
	    public static boolean checkGetMet(Method[] methods, String fieldGetMet) {
	        for (Method met : methods) {
	            if (fieldGetMet.equals(met.getName())) {
	                return true;
	            }
	        }
	        return false;
	    }
}
