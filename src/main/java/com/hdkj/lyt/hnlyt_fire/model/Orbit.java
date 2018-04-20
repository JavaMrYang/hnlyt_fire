package com.hdkj.lyt.hnlyt_fire.model;

import java.util.ArrayList;
import java.util.List;

import com.sun.jmx.snmp.Timestamp;

public class Orbit {
	private String phone;
	private String lat;
	private String lng;
	private Timestamp currentTime;
	private String height;
	private String yaw;
	private String speed;
	private String backup1;
	private String backup2;
	
	public List<String> getOrbitVlaues(){
		List<String> list = new ArrayList<String>();
		
		list.add(phone);
		list.add(lat);
		list.add(lng);
		list.add(currentTime.toString());
		list.add(height);
		list.add(yaw);
		list.add(speed);
		list.add(backup1);
		list.add(backup2);
		
		return list;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public Timestamp getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(Timestamp currentTime) {
		this.currentTime = currentTime;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getYaw() {
		return yaw;
	}
	public void setYaw(String yaw) {
		this.yaw = yaw;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getBackup1() {
		return backup1;
	}
	public void setBackup1(String backup1) {
		this.backup1 = backup1;
	}
	public String getBackup2() {
		return backup2;
	}
	public void setBackup2(String backup2) {
		this.backup2 = backup2;
	}
	
	
}
