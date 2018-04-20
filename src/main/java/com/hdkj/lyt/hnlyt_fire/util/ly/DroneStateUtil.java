package com.hdkj.lyt.hnlyt_fire.util.ly;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.hdkj.lyt.hnlyt_fire.model.DroneState;

public class DroneStateUtil {
	private final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
    private DroneState ds;
    private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DroneStateUtil(DroneState ds){
    	this.ds=ds;
    }
	public DroneStateUtil() {
	}
	/**
	 * 判断条件是否包含在实体类里面
	 * @param village
	 * @param city
	 * @param town
	 * @param beginTime
	 * @param endTime
	 * @param type
	 * @throws ParseException
	 * @return boolean
	 * @date 2018-4-4
	 */
	public boolean isContainCodition(String village,String city,String town,String beginTime,
			String endTime,String type) throws ParseException{	
		boolean flag=true;
		if(!StringUtils.isBlank(city)){  
			flag=ds.getCity().contains(city);
		}
		if(!StringUtils.isBlank(village)){
			flag=ds.getVillage().contains(village);
		}
		if(!StringUtils.isBlank(town)){
			flag=ds.getTown().contains(town);
		}
	    if(!StringUtils.isBlank(type)){
			flag=ds.getLiveModle().contains(type);	
		}
	    if(!StringUtils.isBlank(beginTime)){
			Date time1=sdf.parse(ds.getOnLineTime());
			Date time2=sdf.parse(beginTime);
            flag = time1.getTime() > time2.getTime();
		 }
		 if(!StringUtils.isBlank(endTime)){
			 Date time1=sdf.parse(ds.getOnLineTime());
			 Date time2=sdf.parse(endTime);
             flag = time1.getTime() < time2.getTime();
		 }				 
		
		return flag;
	}
	/**
	 * 判断是否包含key
	 * @param name
	 * @return boolean
	 * @date 2018-4-4
	 */
	public boolean isContainName(String name){
		boolean flag=true;
		if(!StringUtils.isBlank(name)){
			flag=this.name.contains(name);
		}
		return flag;
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
