package com.hdkj.lyt.hnlyt_fire.util;

import java.text.SimpleDateFormat;

public class Contant {
	public static final SimpleDateFormat DATE_LONG_FM = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final String ERROR_JSON_MSG = "{\"msg\",\"1\"}";
	
	public static final String OK_MSG = "0";
	public static final String ERROR_MSG = "1";
	
	//一页20条数据
	public static final int PAGE_COUNT = 20;
		
	public static final String HLY_KEY="f1e7bbd65746c09f2a222669";  //护林员的key
	public static final String HLY_MASTERSECRET="d86ff60537a466a10e87892e"; //护林员的mastersecret
	
	public static final String FH_KEY= "12abb23efaa0c600412e4ced";//防火员的appKey
    public static final String FH_MASTERSECRET= "75067e9537d81b125c75711f";//防火的masterSecret
}
