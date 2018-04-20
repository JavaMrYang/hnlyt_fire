package com.hdkj.lyt.hnlyt_fire.model.ly;

import java.io.Serializable;

/**
 * 扑火指挥
 * @author userYang
 *
 */
public class FireLine implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id; //扑火指挥id
	private String name;  //名称
	private String publishTime; //发布时间
	private String province;  //省
	private String city; //市
	private String town;  //区
	private String location; //位置
	private String publishName;  //发布人
	private String layoutImg;    //排布缩略图
	private String backup1;    //备用字段1
	private String backup2;    //备用字段2
	private String backup3;    //备用字段3
	private String street;  //街道
	private String status;  //状态
	private String layoutImg2; //排布缩略图2
	private String desc;//描述
	private String postiontype;//位置类型
	
	public String getPostiontype() {
		return postiontype;
	}
	public void setPostiontype(String postiontype) {
		this.postiontype = postiontype;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLayoutImg2() {
		return layoutImg2;
	}
	public void setLayoutImg2(String layoutImg2) {
		this.layoutImg2 = layoutImg2;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public String getLayoutImg() {
		return layoutImg;
	}
	public void setLayoutImg(String layoutImg) {
		this.layoutImg = layoutImg;
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
