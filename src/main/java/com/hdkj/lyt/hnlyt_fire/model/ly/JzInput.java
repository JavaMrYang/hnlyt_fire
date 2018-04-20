package com.hdkj.lyt.hnlyt_fire.model.ly;


public class JzInput {
private Integer id; //评估id
private Integer fireId; //火灾编号，外键
private String jzInput1;//救灾投入
private String jzInput2;//救灾投入
private String jzInput3;//救灾投入
private String time;//时间(h)
private String wastage;//消耗量(升)
private String costMaterial;////消耗量(套)
private String price1;//价格
private String price2;//价格
private String price3;//价格
private String jzTotal1;//合计
private String jzTotal2;//合计
private String jzTotal3;//合计
private String backup1; //备用字段1
private String backup2; //备用字段2
private String backup3; //备用字段3

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getFireId() {
	return fireId;
}
public void setFireId(Integer fireId) {
	this.fireId = fireId;
}

public String getJzInput1() {
	return jzInput1;
}
public void setJzInput1(String jzInput1) {
	this.jzInput1 = jzInput1;
}
public String getJzInput2() {
	return jzInput2;
}
public void setJzInput2(String jzInput2) {
	this.jzInput2 = jzInput2;
}
public String getJzInput3() {
	return jzInput3;
}
public void setJzInput3(String jzInput3) {
	this.jzInput3 = jzInput3;
}

public String getWastage() {
	return wastage;
}
public void setWastage(String wastage) {
	this.wastage = wastage;
}
public String getCostMaterial() {
	return costMaterial;
}
public void setCostMaterial(String costMaterial) {
	this.costMaterial = costMaterial;
}

public String getPrice1() {
	return price1;
}
public void setPrice1(String price1) {
	this.price1 = price1;
}
public String getPrice2() {
	return price2;
}
public void setPrice2(String price2) {
	this.price2 = price2;
}
public String getPrice3() {
	return price3;
}
public void setPrice3(String price3) {
	this.price3 = price3;
}
public String getJzTotal1() {
	return jzTotal1;
}
public void setJzTotal1(String jzTotal1) {
	this.jzTotal1 = jzTotal1;
}
public String getJzTotal2() {
	return jzTotal2;
}
public void setJzTotal2(String jzTotal2) {
	this.jzTotal2 = jzTotal2;
}
public String getJzTotal3() {
	return jzTotal3;
}
public void setJzTotal3(String jzTotal3) {
	this.jzTotal3 = jzTotal3;
}

public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
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
