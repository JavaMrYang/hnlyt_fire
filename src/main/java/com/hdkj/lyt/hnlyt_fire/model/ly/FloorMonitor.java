package com.hdkj.lyt.hnlyt_fire.model.ly;

import java.io.Serializable;


/**
 * 地面监控表
 * @author userYang
 *
 */
public class FloorMonitor implements Serializable{
private static final long serialVersionUID = 1L;
private Integer id;  //地面监控id
private String province;  //省
private String city;   //市
private String town;   //区
private String street;  //街道
private String location;  //位置
private String deviceName;  //设备名
private String inputName;   //录入人
private String inputTime;   //录入时间
private String videoStreamAdr;  //视频流地址
private String desc;      //地址
private String image;     //图像上传字段
private String backup1;    //备用字段1
private String backup2;    //备用字段2
private String backup3;    //备用字段3
private String status;    //状态
private String phone;  //手机号

public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
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
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDeviceName() {
	return deviceName;
}
public void setDeviceName(String deviceName) {
	this.deviceName = deviceName;
}
public String getInputName() {
	return inputName;
}
public void setInputName(String inputName) {
	this.inputName = inputName;
}
public String getInputTime() {
	return inputTime;
}
public void setInputTime(String inputTime) {
	this.inputTime = inputTime;
}
public String getVideoStreamAdr() {
	return videoStreamAdr;
}
public void setVideoStreamAdr(String videoStreamAdr) {
	this.videoStreamAdr = videoStreamAdr;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
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
public String getBackup3() {
	return backup3;
}
public void setBackup3(String backup3) {
	this.backup3 = backup3;
}

}
