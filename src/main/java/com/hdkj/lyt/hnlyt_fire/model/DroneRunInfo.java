package com.hdkj.lyt.hnlyt_fire.model;

import java.sql.Timestamp;

/**
 * 飞机飞行日志
 * 
 * @author huangjz
 * 
 */
public class DroneRunInfo {
	private String publishName;//用户名
	private String droneLat;//飞机纬度
	private String droneLng;//飞机经度
	private String relativeHeight;//相对高度
	private String heightAboveSea;//海拔高度
	private String appRunTime;//软件运行时间
	private String mobleLat;//手机纬度
	private String mobleLng;//手机经度
	private String speed;//速度
	private String city;//市
	private String town;//县
	private String village;//镇
	private String yaw;//飞机方位角
	private String time;//时间
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getYaw() {
		return yaw;
	}
	public void setYaw(String yaw) {
		this.yaw = yaw;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public String getDroneLat() {
		return droneLat;
	}
	public void setDroneLat(String droneLat) {
		this.droneLat = droneLat;
	}
	public String getDroneLng() {
		return droneLng;
	}
	public void setDroneLng(String droneLng) {
		this.droneLng = droneLng;
	}
	public String getRelativeHeight() {
		return relativeHeight;
	}
	public void setRelativeHeight(String relativeHeight) {
		this.relativeHeight = relativeHeight;
	}
	public String getHeightAboveSea() {
		return heightAboveSea;
	}
	public void setHeightAboveSea(String heightAboveSea) {
		this.heightAboveSea = heightAboveSea;
	}
	public String getAppRunTime() {
		return appRunTime;
	}
	public void setAppRunTime(String appRunTime) {
		this.appRunTime = appRunTime;
	}
	public String getMobleLat() {
		return mobleLat;
	}
	public void setMobleLat(String mobleLat) {
		this.mobleLat = mobleLat;
	}
	public String getMobleLng() {
		return mobleLng;
	}
	public void setMobleLng(String mobleLng) {
		this.mobleLng = mobleLng;
	}
	
	
}
