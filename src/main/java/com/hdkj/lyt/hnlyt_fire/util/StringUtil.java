package com.hdkj.lyt.hnlyt_fire.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.hdkj.lyt.hnlyt_fire.model.User;

public class StringUtil {
	public static void main(String[] args) {
		System.out.println(appTypeCheck("2", "10000")==null);
	}
	
	/**
	 * 校验该登陆用户是否可以登录
	 * @param type 0，1，2，3
	 * @param appType 11111
	 * @return appType单个权限
	 */
	public static String appTypeCheck(String type,String appType){
		StringBuffer sb = new StringBuffer(appType);
		appType = sb.reverse().toString();//翻转
		
		//0防火员 1护林员 2无人机 3载人机 4web用户
		if(type.equals("0")){//防火
			String s = appType.charAt(0)+"";
			return s.equals("0")?null:"0";
		}else if(type.equals("1")){//护林员
			String s = appType.charAt(1)+"";
			return s.equals("0")?null:"1";
		}else if(type.equals("2")){
			String s = appType.charAt(2)+"";
			return s.equals("0")?null:"2";
		}else if(type.equals("3")){
			String s = appType.charAt(3)+"";
			return s.equals("0")?null:"3";
		}else if(type.equals("4")){
			String s = appType.charAt(4)+"";
			return s.equals("0")?null:"4";
		}
		
		return null;
	}
	
	/**
	 * 获取该月的最大天数
	 * @param month 2014-02
	 * @return
	 */
	public static String checkBiMonth(String month){
		
		String[] strs = month.split("-");
		
		if(strs[1].equals("01")){
			return month+"-31";
		}
		if(strs[1].equals("02")){
			int day = get2Days(Integer.parseInt(strs[0]));
			return month+"-"+day;
		}
		if(strs[1].equals("03")){
			return month+"-31";
		}
		if(strs[1].equals("04")){
			return month+"-30";
		}
		if(strs[1].equals("05")){
			return month+"-31";
		}
		if(strs[1].equals("06")){
			return month+"-30";
		}
		if(strs[1].equals("07")){
			return month+"-31";
		}
		if(strs[1].equals("08")){
			return month+"-31";
		}
		if(strs[1].equals("09")){
			return month+"-30";
		}
		if(strs[1].equals("10")){
			return month+"-31";
		}
		if(strs[1].equals("11")){
			return month+"-30";
		}
		if(strs[1].equals("12")){
			return month+"-31";
		}
		return null;
	}
	/**
	 * 计算某一年2月份有多少天
	 * @param year
	 * @return
	 */
	private static int get2Days(int year){
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);//0-11->1-12  将日期设置为某一年的3月1号
        c.add(Calendar.DAY_OF_MONTH, -1);//将日期减去一天，即日期变成2月的最后一天
        return c.get(Calendar.DAY_OF_MONTH);//返回二月最后一天的具体值
    }
	
	public static int getMaxDay(int year,int month){
        Calendar c = Calendar.getInstance();
        c.set(year,month,1);//0-11->1-12  将日期设置为某一年的3月1号
        c.add(Calendar.DAY_OF_MONTH, -1);//将日期减去一天，即日期变成2月的最后一天
        return c.get(Calendar.DAY_OF_MONTH);//返回二月最后一天的具体值
    }
	/**
	 * 获取当前月的最大日期
	 * @return
	 */
	public static String getCurrentMothMaxDay(){
		String date = new SimpleDateFormat("yyyy-MM").format(new Date());
		String[] dates = date.split("-");
	
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(dates[0]),Integer.parseInt(dates[1]),1);//0-11->1-12  将日期设置为某一年的3月1号
        c.add(Calendar.DAY_OF_MONTH, -1);//将日期减去一天，即日期变成2月的最后一天
        return date+"-"+c.get(Calendar.DAY_OF_MONTH);//返回二月最后一天的具体值
    }
	/**
	 * 获取当前月的最新日期
	 * @return
	 */
	public static String getCurrentMothMinDay() {
		String date = new SimpleDateFormat("yyyy-MM").format(new Date());
		return date+"-01";
	}
	/**
	 * 获取当前年份
	 * @return
	 */
	public static String getCurrentYear() {
		String year = new SimpleDateFormat("yyyy").format(new Date());
		return year;
	}

	public static String getFireCityCondition(int userLevel,User u) {
		String cityCondition = "";
		if(userLevel == 0){//省级
			
		}else if(userLevel == 1){//市级
			cityCondition = " and fireArea='"+u.getCity()+"'";
		}else if(userLevel == 2){//县级
			cityCondition = " and fireArea='"+u.getCity()+"' and fireAreaTown='"+u.getTown()+"'";
		}else if(userLevel == 3){//镇级
			cityCondition = " and fireArea='"+u.getCity()+"' and fireAreaTown='"+u.getTown()+"' and village='"+u.getStreet()+"'";
		}
		return cityCondition;
	}
}
