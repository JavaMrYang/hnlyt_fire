package com.hdkj.lyt.hnlyt_fire.model;

public class FireSearch {
	private String id;//火灾id
	private String city;//火灾市
	private String town;//火灾区
	private String area;//火灾县
	private String status;//火灾状态 0：已上报；1：已跟踪；3已结束
	private String time;//火灾创建时间
	private String fireLevel;//火情等级
	private String fireKind;//火情总类
	private String fireMj;//火灾面积
	private String userName;//上传人
	private String latLngs;//经纬度 lat,lng_lat,lng
	private String total;
	private String phone;
	
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getFireLevel() {
		return fireLevel;
	}
	public void setFireLevel(String fireLevel) {
		this.fireLevel = fireLevel;
	}
	public String getFireKind() {
		return fireKind;
	}
	public void setFireKind(String fireKind) {
		this.fireKind = fireKind;
	}
	public String getFireMj() {
		return fireMj;
	}
	public void setFireMj(String fireMj) {
		this.fireMj = fireMj;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLatLngs() {
		return latLngs;
	}
	public void setLatLngs(String latLngs) {
		this.latLngs = latLngs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
