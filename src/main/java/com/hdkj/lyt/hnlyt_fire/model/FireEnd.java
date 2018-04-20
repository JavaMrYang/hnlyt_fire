package com.hdkj.lyt.hnlyt_fire.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 火情结束
 * @author huangjz
 *
 */
@Entity
@Table(name = "tb_FireEnd")
public class FireEnd {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;//火灾上报的id
	private String userName;//填报人
	private String keepTime;//持续时长
	private String fireArea;//过火面积
	private String destroyBuild;//破坏建筑
	private String death;//死亡人数
	private String injured;//受伤人数
	private String economicLoss;//经济损失
	private String  hiddenDanger;//安全隐患 0 无 1 有
	private String reason;//隐患可能发生的原因
	private String experience;//经验总结
	private String creactTime;//创建时间
	private String photoName1;//图片1
	private String photoName2;//图片1
	private String photoName3;//图片1
	private String photoName4;//图片1
	private String latLngs;
	private String pointTpye;
	private String backup1;//备用
	private String backup2;//备用
	private String backup3;//备用
	private String inputTime;
	
	public String getInputTime() {
		return inputTime;
	}
	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}
	public String getLatLngs() {
		return latLngs;
	}
	public void setLatLngs(String latLngs) {
		this.latLngs = latLngs;
	}
	public String getPointTpye() {
		return pointTpye;
	}
	public void setPointTpye(String pointTpye) {
		this.pointTpye = pointTpye;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getKeepTime() {
		return keepTime;
	}
	public void setKeepTime(String keepTime) {
		this.keepTime = keepTime;
	}
	public String getFireArea() {
		return fireArea;
	}
	public void setFireArea(String fireArea) {
		this.fireArea = fireArea;
	}
	public String getDestroyBuild() {
		return destroyBuild;
	}
	public void setDestroyBuild(String destroyBuild) {
		this.destroyBuild = destroyBuild;
	}
	public String getDeath() {
		return death;
	}
	public void setDeath(String death) {
		this.death = death;
	}
	public String getInjured() {
		return injured;
	}
	public void setInjured(String injured) {
		this.injured = injured;
	}
	public String getEconomicLoss() {
		return economicLoss;
	}
	public void setEconomicLoss(String economicLoss) {
		this.economicLoss = economicLoss;
	}
	public String getHiddenDanger() {
		return hiddenDanger;
	}
	public void setHiddenDanger(String hiddenDanger) {
		this.hiddenDanger = hiddenDanger;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCreactTime() {
		return creactTime;
	}
	public void setCreactTime(String creactTime) {
		this.creactTime = creactTime;
	}
	public String getPhotoName1() {
		return photoName1;
	}
	public void setPhotoName1(String photoName1) {
		this.photoName1 = photoName1;
	}
	public String getPhotoName2() {
		return photoName2;
	}
	public void setPhotoName2(String photoName2) {
		this.photoName2 = photoName2;
	}
	public String getPhotoName3() {
		return photoName3;
	}
	public void setPhotoName3(String photoName3) {
		this.photoName3 = photoName3;
	}
	public String getPhotoName4() {
		return photoName4;
	}
	public void setPhotoName4(String photoName4) {
		this.photoName4 = photoName4;
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
