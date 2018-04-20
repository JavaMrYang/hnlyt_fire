package com.hdkj.lyt.hnlyt_fire.model;

import com.hdkj.lyt.hnlyt_fire.model.data.FireData;

import net.sf.json.JSONArray;

public class FireDataCount {
	private String city;
	private FireData data;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public FireData getData() {
		return data;
	}
	public void setData(FireData data) {
		this.data = data;
	}
	public static void main(String[] args) {
		FireDataCount d = new FireDataCount();
//		System.out.println(new Data());
//		
		d.setData(new FireData());
		JSONArray json = JSONArray.fromObject(d);
		System.out.println(json);
	}
	
}



