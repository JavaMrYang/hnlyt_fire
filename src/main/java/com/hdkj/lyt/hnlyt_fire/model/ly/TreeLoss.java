package com.hdkj.lyt.hnlyt_fire.model.ly;

/**
 * 林木损失表
 * @author userYang
 *
 */
public class TreeLoss {
private Integer id; //评估id
private Integer fireId; //火灾编号，外键
private String treeType;//树种
private String lossLevel;//损失程度
private String lossArea;//损失材积
private String treeTotal;//合计
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
public String getTreeType() {
	return treeType;
}
public void setTreeType(String treeType) {
	this.treeType = treeType;
}

public String getLossLevel() {
	return lossLevel;
}
public void setLossLevel(String lossLevel) {
	this.lossLevel = lossLevel;
}
public String getLossArea() {
	return lossArea;
}
public void setLossArea(String lossArea) {
	this.lossArea = lossArea;
}

public String getTreeTotal() {
	return treeTotal;
}
public void setTreeTotal(String treeTotal) {
	this.treeTotal = treeTotal;
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
