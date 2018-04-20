package com.hdkj.lyt.hnlyt_fire.model;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;

public class FireEchartsDate {
	private String name;
	private String[] value = new String[2];
	
	public FireEchartsDate(String name, String[] value) {
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getValue() {
		return value;
	}
	public void setValue(String[] value) {
		this.value = value;
	}
	public static void main(String[] args) {
		List<FireEchartsDate> fs = new ArrayList<FireEchartsDate>();
		
		fs.add(new FireEchartsDate("2017-01-02",new String[]{"2017-01-02","10"}));
		fs.add(new FireEchartsDate("2017-01-03",new String[]{"2017-01-03","15"}));
		fs.add(new FireEchartsDate("2017-01-04",new String[]{"2017-01-04","14"}));
		fs.add(new FireEchartsDate("2017-01-05",new String[]{"2017-01-05","12"}));
		fs.add(new FireEchartsDate("2017-01-06",new String[]{"2017-01-06","18"}));
		fs.add(new FireEchartsDate("2017-01-07",new String[]{"2017-01-07","14"}));
		fs.add(new FireEchartsDate("2017-01-08",new String[]{"2017-01-08","16"}));
		
		JSONArray json = JSONArray.fromObject(fs);
		System.out.println(json);
	}
	
}
