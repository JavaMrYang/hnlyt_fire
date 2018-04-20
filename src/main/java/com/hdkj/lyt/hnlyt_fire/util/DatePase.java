package com.hdkj.lyt.hnlyt_fire.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePase {
	private static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String[] getStartEndTime(String key, String startTime, String endTime){
		
		String[] dates = new String[2];
		Calendar time = Calendar.getInstance();
		if(key.trim().equals("-1")){
			startTime = "";
			endTime = "";
		}else if(key.trim().equals("0")){
			time.set(Calendar.DATE, time.get(Calendar.DATE)-2);//近三天
			startTime = sf.format(time.getTime());
			endTime = sf.format(new Date());
		}else if(key.trim().equals("1")){
			time.set(Calendar.DATE, time.get(Calendar.DATE)-6);//近一周
			startTime = sf.format(time.getTime());
			endTime = sf.format(new Date());
		}else if(key.trim().equals("2")){
			time.set(Calendar.MONTH, time.get(Calendar.MONTH)-1);//近一月
			startTime = sf.format(time.getTime());
			endTime = sf.format(new Date());
		}
		dates[0] = startTime;
		dates[1] = endTime;
		
		return dates;
	}
}
