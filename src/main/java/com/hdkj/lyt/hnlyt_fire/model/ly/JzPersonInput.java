package com.hdkj.lyt.hnlyt_fire.model.ly;


/**
 * 救灾人员投入
 * @author userYang
 *
 */
public class JzPersonInput {
private Integer id; //评估id
private Integer fireId; //火灾编号，外键
private String personJzInput;//救灾投入
private Double personTime;//时间(h)
private Integer personAmount;//人数
private Double salary;//工资标准
private String food;//伙食标准
private String personTotal;//合计
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
public String getPersonJzInput() {
	return personJzInput;
}

public Double getPersonTime() {
	return personTime;
}
public void setPersonTime(Double personTime) {
	this.personTime = personTime;
}
public void setPersonJzInput(String personJzInput) {
	this.personJzInput = personJzInput;
}
public Integer getPersonAmount() {
	return personAmount;
}
public void setPersonAmount(Integer personAmount) {
	this.personAmount = personAmount;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public String getFood() {
	return food;
}
public void setFood(String food) {
	this.food = food;
}
public String getPersonTotal() {
	return personTotal;
}
public void setPersonTotal(String personTotal) {
	this.personTotal = personTotal;
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
public void setFireId(Integer fireId) {
	this.fireId = fireId;
}


}
