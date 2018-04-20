package com.hdkj.lyt.hnlyt_fire.util;

public class SqlUtil {
	
	public static String getCityCondition(String city,String town,String village){
		String contidtion = "";
		
		if(city != null && !city.equals("")){
			contidtion = contidtion + " and city='"+city+"'";
		}
		if(town != null && !town.equals("")){
			contidtion = contidtion + " and town='"+town+"'";
		}
		if(village != null && !village.equals("")){
			contidtion = contidtion + " and village='"+village+"'";
		}
		
		return contidtion;
	}
	
}
