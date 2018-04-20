package com.hdkj.lyt.hnlyt_fire.model;

public class GpsData {
	private String lat;
	private String lng;
	private String name;
	private String addr;
	private String phone;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\"lat\":")
		.append("\"")
		.append(lat)
		.append("\"")
		.append(",")
		.append("\"lng\":")
		.append("\"")
		.append(lng)
		.append("\"")
		.append(",")
		.append("\"name\":")
		.append("\"")
		.append(name)
		.append("\"")
		.append(",")
		.append("\"addr\":")
		.append("\"")
		.append(addr)
		.append("\"")
		.append(",")
		.append("\"phone\":")
		.append("\"")
		.append(phone)
		.append("\"}");
		return sb.toString();
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
