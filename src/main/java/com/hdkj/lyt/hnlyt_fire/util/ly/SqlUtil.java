package com.hdkj.lyt.hnlyt_fire.util.ly;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


public class SqlUtil {

	/**
	 * 通过实体类动态获取插入方法的sql语句
	 * @param obj
	 * @param tableName
	 * @param params
	 * @return String
	 * @date 2018-3-24
	 */
	public static String getInsertSql(Object obj,String tableName,List<Object> params){
		if(obj==null){
			return null;
		}
	    //定义插入的sql语句
		StringBuilder pSql=new StringBuilder("insert into "+tableName);
		//定义插入域名
		StringBuilder paramFileds=new StringBuilder();
		//定义插入的值
		StringBuilder pValue=new StringBuilder();
		Class<?>  cls=obj.getClass();
		System.out.println(cls.getClassLoader().getParent());
		Method[] methods=cls.getDeclaredMethods();  //获取该对象的方法
		Field[] fields=cls.getDeclaredFields();    //获取该对象的域名
		for(Field field:fields){
			System.out.println(joinGetName(field.getName()));
			String filedName=joinGetName(field.getName());  //拼接他的get方法名称
			if(!checkGetMet(methods, filedName))
				continue;  //如果没有get方法就跳过
			try {
				Method fieldGetMet=cls.getDeclaredMethod(filedName); //通过get方法名称实例化该方法
				Object fieldVal=fieldGetMet.invoke(obj);  //获取该方法的值
				if(fieldVal!=null){
					if(!"".equals(fieldVal)){
						paramFileds.append("["+field.getName()+"]"+",");
						pValue.append("?,");  
						params.add(fieldVal);
					}
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		pSql.append(" ("+paramFileds.substring(0, paramFileds.length()-1)+") values("+pValue.substring(0,pValue.length()-1)+")");
		return pSql.toString();
	}	

	/**
	 * 通过实体类动态获取修改方法的sql语句
	 * @param obj
	 * @param tableName
	 * @param params
	 * @return String
	 * @date 2018-3-24
	 */
	public static String getUpdateSql(Object obj,String tableName,List<Object> params,String pKey){
		if(obj==null){
			return null;
		}
		StringBuilder pSql=new StringBuilder("update "+tableName+" set ");
		StringBuilder paramFileds=new StringBuilder();
		StringBuilder pWhere=new StringBuilder();
		String pValue="";
		Class<?>  cls=obj.getClass();
		//System.out.println(cls.getClassLoader().getParent());
		Method[] methods=cls.getDeclaredMethods();
		Field[] fields=cls.getDeclaredFields();
		for(Field field:fields){
			//System.out.println(joinGetName(field.getName()));
			String filedName=joinGetName(field.getName());
			if(!checkGetMet(methods, filedName))
				continue;  //如果没有get方法就跳过
			try {
				Method fieldGetMet=cls.getDeclaredMethod(filedName);
				Object fieldVal=fieldGetMet.invoke(obj);
				if(fieldVal!=null){
					if(!"".equals(fieldVal)){
						if(pKey.equals(field.getName())){
                        	pWhere.append("["+pKey+"]=?");
                        	pValue=fieldVal.toString();  //存取修改的唯一字段名
                        	continue;
                        }else{
                        	paramFileds.append("["+field.getName()+"]=?,");
                        }
						params.add(fieldVal);
					}
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		params.add(pValue); //添加最后修改的字段值条件
		pSql.append(paramFileds.substring(0, paramFileds.length()-1)+" where "+pWhere);
		return pSql.toString();
	}	
    /**
	 * 拼接get属性方法
	 * @param name
	 * @return String
	 * @date 2018-3-24
	 */
	public static String joinGetName(String name){
		if(StringUtils.isBlank(name))
			return null;
		int startIndex=0;
		if(name.charAt(0)=='_')
			startIndex=1;
		return "get"+name.substring(startIndex,startIndex+1).toUpperCase()+
				name.substring(startIndex+1);
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
