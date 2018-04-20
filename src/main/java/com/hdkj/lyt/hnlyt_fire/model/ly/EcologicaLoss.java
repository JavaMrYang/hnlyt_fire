package com.hdkj.lyt.hnlyt_fire.model.ly;

/**
 * 生态损失
 * @author userYang
 *
 */
public class EcologicaLoss {
private Integer id; //评估id
private Integer fireId; //火灾编号，外键
private String woodsType;//林木种类
private String fireArea;//过火面积
private String ecTotal;//合计
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
public String getWoodsType() {
	return woodsType;
}
public void setWoodsType(String woodsType) {
	this.woodsType = woodsType;
}
public String getFireArea() {
	return fireArea;
}
public void setFireArea(String fireArea) {
	this.fireArea = fireArea;
}

public String getEcTotal() {
	return ecTotal;
}
public void setEcTotal(String ecTotal) {
	this.ecTotal = ecTotal;
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
