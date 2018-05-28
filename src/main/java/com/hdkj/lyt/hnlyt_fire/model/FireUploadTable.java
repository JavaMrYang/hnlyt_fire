package com.hdkj.lyt.hnlyt_fire.model;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * 火灾上报
 * @author huangjz
 *
 */
@Entity
@Table(name = "tb_FireUploadTable")
public class FireUploadTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "userName",length = 15)
	private String userName;
	private String fireArea;//火情所在市
	private String fireAreaTown;//火情所在县
	private String village;//火情所在镇
	private String hotId;//火情Id
	private String fireMj;
	private String creactTime;
	private String fireLeve;
	private String fireKind;
	private String latLngs;//经纬度lat,lng_lat,lng
	private String pointTpye;//位置类型 点0 线1 面2 
	private String fireCause;
	private String fireHj;
	private String fireLeveBz;
	private String fireKindBz;
	private String photoName1;
	private String photoName2;
	private String photoName3;
	private String photoName4;
	private String videoName1;
	private String videoName2;
	private String videoName3;
	private String videoName4;
	private String backup1;
	private String backup2;
	private String backup3;
	private String backup4;
	private String city;//用户所在市
	private String town;//用户所在县
	private String fireStatus;//0:已上报 1：已跟踪 2：已完结
	private String createDate;
	private String inputTime;
	private String isAssess; //是否评估


	public String getIsAssess() {
		return isAssess;
	}
	public void setIsAssess(String isAssess) {
		this.isAssess = isAssess;
	}
	public String getInputTime() {
		return inputTime;
	}
	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getHotId() {
		return hotId;
	}
	public void setHotId(String hotId) {
		this.hotId = hotId;
	}
	public String getFireAreaTown() {
		return fireAreaTown;
	}
	public void setFireAreaTown(String fireAreaTown) {
		this.fireAreaTown = fireAreaTown;
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
	public String getFireArea() {
		return fireArea;
	}
	public void setFireArea(String fireArea) {
		this.fireArea = fireArea;
	}
	public String getCreactTime() {
		return creactTime;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public void setCreactTime(String creactTime) {
		this.creactTime = creactTime;
	}
	public String getFireStatus() {
		return fireStatus;
	}
	public void setFireStatus(String fireStatus) {
		this.fireStatus = fireStatus;
	}
	
	public String getFireMj() {
		return fireMj;
	}
	public void setFireMj(String fireMj) {
		this.fireMj = fireMj;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFireLeve() {
		return fireLeve;
	}
	public void setFireLeve(String fireLeve) {
		this.fireLeve = fireLeve;
	}
	public String getFireKind() {
		return fireKind;
	}
	public void setFireKind(String fireKind) {
		this.fireKind = fireKind;
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
	public String getFireCause() {
		return fireCause;
	}
	public void setFireCause(String fireCause) {
		this.fireCause = fireCause;
	}
	public String getFireHj() {
		return fireHj;
	}
	public void setFireHj(String fireHj) {
		this.fireHj = fireHj;
	}
	public String getFireLeveBz() {
		return fireLeveBz;
	}
	public void setFireLeveBz(String fireLeveBz) {
		this.fireLeveBz = fireLeveBz;
	}
	public String getFireKindBz() {
		return fireKindBz;
	}
	public void setFireKindBz(String fireKindBz) {
		this.fireKindBz = fireKindBz;
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
	public String getVideoName1() {
		return videoName1;
	}
	public void setVideoName1(String videoName1) {
		this.videoName1 = videoName1;
	}
	public String getVideoName2() {
		return videoName2;
	}
	public void setVideoName2(String videoName2) {
		this.videoName2 = videoName2;
	}
	public String getVideoName3() {
		return videoName3;
	}
	public void setVideoName3(String videoName3) {
		this.videoName3 = videoName3;
	}
	public String getVideoName4() {
		return videoName4;
	}
	public void setVideoName4(String videoName4) {
		this.videoName4 = videoName4;
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
	public String getBackup4() {
		return backup4;
	}
	public void setBackup4(String backup4) {
		this.backup4 = backup4;
	}
	
}
