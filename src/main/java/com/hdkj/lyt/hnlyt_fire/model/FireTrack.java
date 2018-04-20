package com.hdkj.lyt.hnlyt_fire.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 火情跟踪表
 * 
 * @author Administrator
 * 
 */
@Entity
@Table(name = "tb_FireTrack")
public class FireTrack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String weather;//天气情况
	private String woodLandArea;//林地面积
	private String mainTree;//主要树种
	private String woodLandFirePostion;//林地与火中位置关系
	private String fireStep;//火情发展阶段
	private String chiefName;//指挥长
	private String chiefJob;//职务
	private String commandGroupName;//指挥组成员
	private String truckmanTeamName;//消防队伍名称
	private String truckmanNo;//消防员人数
	private String materialSupply;//物资调拨
	private String estimatedFireTime;//预计灭火时间
	private String creactTime;//跟踪时间
	private String photoName1;//图片1
	private String photoName2;//图片2
	private String photoName3;//图片3
	private String photoName4;//图片4
	private String userName;//填报人
	private String backup1;//备用字段
	private String backup2;//备用字段
	private String backup3;//备用字段
	private String latLngs;//经纬度 lat,lng_lat,lng
	private String pointType;//位置类型 点0 线1 面2
	private String status;//火灾状态
	private String inputTime;
	
	public String getInputTime() {
		return inputTime;
	}
	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLatLngs() {
		return latLngs;
	}
	public void setLatLngs(String latLngs) {
		this.latLngs = latLngs;
	}
	public String getPointType() {
		return pointType;
	}
	public void setPointType(String pointType) {
		this.pointType = pointType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWoodLandArea() {
		return woodLandArea;
	}
	public void setWoodLandArea(String woodLandArea) {
		this.woodLandArea = woodLandArea;
	}
	public String getMainTree() {
		return mainTree;
	}
	public void setMainTree(String mainTree) {
		this.mainTree = mainTree;
	}
	public String getWoodLandFirePostion() {
		return woodLandFirePostion;
	}
	public void setWoodLandFirePostion(String woodLandFirePostion) {
		this.woodLandFirePostion = woodLandFirePostion;
	}
	public String getFireStep() {
		return fireStep;
	}
	public void setFireStep(String fireStep) {
		this.fireStep = fireStep;
	}
	public String getChiefName() {
		return chiefName;
	}
	public void setChiefName(String chiefName) {
		this.chiefName = chiefName;
	}
	public String getChiefJob() {
		return chiefJob;
	}
	public void setChiefJob(String chiefJob) {
		this.chiefJob = chiefJob;
	}
	public String getCommandGroupName() {
		return commandGroupName;
	}
	public void setCommandGroupName(String commandGroupName) {
		this.commandGroupName = commandGroupName;
	}
	public String getTruckmanTeamName() {
		return truckmanTeamName;
	}
	public void setTruckmanTeamName(String truckmanTeamName) {
		this.truckmanTeamName = truckmanTeamName;
	}
	public String getTruckmanNo() {
		return truckmanNo;
	}
	public void setTruckmanNo(String truckmanNo) {
		this.truckmanNo = truckmanNo;
	}
	public String getMaterialSupply() {
		return materialSupply;
	}
	public void setMaterialSupply(String materialSupply) {
		this.materialSupply = materialSupply;
	}
	public String getEstimatedFireTime() {
		return estimatedFireTime;
	}
	public void setEstimatedFireTime(String estimatedFireTime) {
		this.estimatedFireTime = estimatedFireTime;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
