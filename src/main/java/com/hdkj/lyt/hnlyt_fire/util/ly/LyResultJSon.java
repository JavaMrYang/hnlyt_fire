package com.hdkj.lyt.hnlyt_fire.util.ly;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class LyResultJSon {

	private Map<String,Object> resultMap=new HashMap<String, Object>();
	public LyResultJSon(Map map){
		this.resultMap=map;
	}
	public static void MapToJsonString(Map map,PrintWriter pw){
		JSONObject json=JSONObject.fromObject(map);
		//System.out.println(json.toString());
		pw.write(json.toString());
		pw.flush();
	}
	public static void listToJsonString(List<Map<String, Object>> rlist,PrintWriter pw){
		JSONArray json=JSONArray.fromObject(rlist);
		//System.out.println(json.toString());
		pw.write(json.toString());
		pw.flush();
	}
	public static void sendCodeAndMsg(String code,String msg,Map<String,Object> map){
		map.put("code", code);
		map.put("msg", msg);
	}
}
