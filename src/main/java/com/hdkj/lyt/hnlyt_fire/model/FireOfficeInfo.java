package com.hdkj.lyt.hnlyt_fire.model;

public class FireOfficeInfo {
	private int id;
	private String city;//市
	private String town;//县
	private String village;//镇
	private String buildTime;//成立时间
	private String inputTime;//录入时间
	private String onDuty;//值班表
	private String officeMember;//人员表
	private String rtmp;//推流地址
	private String desc;//描述
	private String latlng;//坐标
	private String images;//图片
	private String manage;
	private String phone;
	private String inputName;
	private int type;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getInputName() {
		return inputName;
	}
	public void setInputName(String inputName) {
		this.inputName = inputName;
	}
	public String getManage() {
		return manage;
	}
	public void setManage(String manage) {
		this.manage = manage;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getBuildTime() {
		return buildTime;
	}
	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}
	public String getInputTime() {
		return inputTime;
	}
	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}
	public String getOnDuty() {
		return onDuty;
	}
	public void setOnDuty(String onDuty) {
		this.onDuty = onDuty;
	}
	public String getOfficeMember() {
		return officeMember;
	}
	public void setOfficeMember(String officeMember) {
		this.officeMember = officeMember;
	}
	public String getRtmp() {
		return rtmp;
	}
	public void setRtmp(String rtmp) {
		this.rtmp = rtmp;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLatlng() {
		return latlng;
	}
	public void setLatlng(String latlng) {
		this.latlng = latlng;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	
}
