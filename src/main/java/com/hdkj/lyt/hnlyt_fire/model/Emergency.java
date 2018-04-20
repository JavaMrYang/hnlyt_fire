package com.hdkj.lyt.hnlyt_fire.model;

public class Emergency {
	private String id;
	private String name;
	private String droneName;
	private String danwei;
	private String droneMadeIn;
	private String incomeDate;
	private String type;
	private String lat;
	private String lng;
	private String createDate;
	private String iconName;
	private String videoName;
	
	
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDroneName() {
		return droneName;
	}
	public void setDroneName(String droneName) {
		this.droneName = droneName;
	}
	public String getDanwei() {
		return danwei;
	}
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	public String getDroneMadeIn() {
		return droneMadeIn;
	}
	public void setDroneMadeIn(String droneMadeIn) {
		this.droneMadeIn = droneMadeIn;
	}
	public String getIncomeDate() {
		return incomeDate;
	}
	public void setIncomeDate(String incomeDate) {
		this.incomeDate = incomeDate;
	}
	public String getIconName() {
		return iconName;
	}
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	
}
