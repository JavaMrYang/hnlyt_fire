package com.hdkj.lyt.hnlyt_fire.model.ly;

/**
 * 灾害评估表
 * @author userYang
 *
 */
public class FireAssessment {
private Integer id; //评估id
private Integer fireId; //火灾编号，外键
private String treeTotal; //林木损失(万元)
private String ecologicalLoss;//生态损失(万元)
private String jzCostInput;//救灾费用投入(万元)
private String fireTotalLoss;//火灾总损失(万元)
private String assessPerson;//评估人
private String assessTime;//评估时间
private String planeImg;//飞机正射图
private String videoImg;//影像资料
private String backup1; //备用字段1
private String backup2; //备用字段2
private String backup3; //备用字段3
private String isAssess;//是否评估
private String userName;//评估人的电话号码


public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getIsAssess() {
	return isAssess;
}
public void setIsAssess(String isAssess) {
	this.isAssess = isAssess;
}
public String getPlaneImg() {
	return planeImg;
}
public void setPlaneImg(String planeImg) {
	this.planeImg = planeImg;
}
public String getVideoImg() {
	return videoImg;
}
public void setVideoImg(String videoImg) {
	this.videoImg = videoImg;
}
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

public String getTreeTotal() {
	return treeTotal;
}
public void setTreeTotal(String treeTotal) {
	this.treeTotal = treeTotal;
}
public String getEcologicalLoss() {
	return ecologicalLoss;
}
public void setEcologicalLoss(String ecologicalLoss) {
	this.ecologicalLoss = ecologicalLoss;
}
public String getJzCostInput() {
	return jzCostInput;
}
public void setJzCostInput(String jzCostInput) {
	this.jzCostInput = jzCostInput;
}
public String getFireTotalLoss() {
	return fireTotalLoss;
}
public void setFireTotalLoss(String fireTotalLoss) {
	this.fireTotalLoss = fireTotalLoss;
}
public String getAssessPerson() {
	return assessPerson;
}
public void setAssessPerson(String assessPerson) {
	this.assessPerson = assessPerson;
}
public String getAssessTime() {
	return assessTime;
}
public void setAssessTime(String assessTime) {
	this.assessTime = assessTime;
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
