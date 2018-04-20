package com.hdkj.lyt.hnlyt_fire.util.ly;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateUtil {

	public static String dateToStr(java.util.Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		    String dateString = formatter.format(dateDate);
		    return dateString;
	 }
	
	public static Date strToSqlDate(String str) throws ParseException{
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		java.util.Date date=formatter.parse(str);
		return new Date(date.getTime());
	}
	
	public static java.util.Date strToUtilDate(String str) throws ParseException{
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return formatter.parse(str);
	}
}
