package com.hdkj.lyt.hnlyt_fire.model;

/**
 * 本组的位置信息
 * @author huangjz
 *
 */
public class UserLatLng {
	private String name;
	private String lat;
	private String lng;
	private String yaw;
	private int socketConn;//用户一键呼叫连接是否正常。0 正常 1没有连接或连接失败
	private String appType;// 11终端类型 0飞机直播 1手机森林防火直播 2手机护林员直播
	private String areaName;
	private String isPublish;//是否直播 0 直播 1未直播
	
	
	
	public UserLatLng(String droneLatitude, String droneLongitude, String yaw,String name,int socketConn,String appType,String areaName,String isPublish) {
		this.lat = droneLatitude;
		this.lng = droneLongitude;
		this.yaw = yaw;
		this.name = name;
		this.socketConn = socketConn;
		this.appType = appType;
		this.areaName = areaName;
		this.isPublish = isPublish;
	}
	
	
	public String getIsPublish() {
		return isPublish;
	}


	public void setIsPublish(String isPublish) {
		this.isPublish = isPublish;
	}


	public String getAreaName() {
		return areaName;
	}


	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}


	public String getAppType() {
		return appType;
	}


	public void setAppType(String appType) {
		this.appType = appType;
	}


	public int getSocketConn() {
		return socketConn;
	}


	public void setSocketConn(int socketConn) {
		this.socketConn = socketConn;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public String getYaw() {
		return yaw;
	}
	public void setYaw(String yaw) {
		this.yaw = yaw;
	}
	
}
