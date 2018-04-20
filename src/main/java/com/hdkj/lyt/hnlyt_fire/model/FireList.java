package com.hdkj.lyt.hnlyt_fire.model;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;

/**
 * 火情列表
 * @author Administrator
 *
 */
public class FireList {
	private String fireId;//火情id
	private String fireArea;//火情区域
	private String fireTime;//火情发生时间
	private String fireLevel;
	private String fireKind;
	private String fireMj;
	private String userName;
	private String fireStatus;
	private String total;//记录总数
	private String fireAreaTown;
	private String village;
	private String backup1;//手机号
	private String isAssess;//是否评估 0为未评估，1为评估
	
	
	public String getIsAssess() {
		return isAssess;
	}
	public void setIsAssess(String isAssess) {
		this.isAssess = isAssess;
	}
	public String getBackup1() {
		return backup1;
	}
	public void setBackup1(String backup1) {
		this.backup1 = backup1;
	}
	public String getFireAreaTown() {
		return fireAreaTown;
	}
	public void setFireAreaTown(String fireAreaTown) {
		this.fireAreaTown = fireAreaTown;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getFireLevel() {
		return fireLevel;
	}
	public void setFireLevel(String fireLevel) {
		this.fireLevel = fireLevel;
	}
	public String getFireKind() {
		return fireKind;
	}
	public void setFireKind(String fireKind) {
		this.fireKind = fireKind;
	}
	public String getFireMj() {
		return fireMj;
	}
	public void setFireMj(String fireMj) {
		this.fireMj = fireMj;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFireStatus() {
		return fireStatus;
	}
	public void setFireStatus(String fireStatus) {
		this.fireStatus = fireStatus;
	}
	public String getFireId() {
		return fireId;
	}
	public void setFireId(String fireId) {
		this.fireId = fireId;
	}
	public String getFireArea() {
		return fireArea;
	}
	public void setFireArea(String fireArea) {
		this.fireArea = fireArea;
	}
	public String getFireTime() {
		return fireTime;
	}
	public void setFireTime(String fireTime) {
		this.fireTime = fireTime;
	}
	
	public static void main(String[] args) {
		List<FireList> ls = new ArrayList<FireList>();
		for(int i=0;i<1;i++){
			FireList f = new FireList();
			f.setFireId("HZ01");
			f.setFireArea("长沙县");
			f.setFireTime("2012-12-12 12:12:12");
			ls.add(f);
		}
		JSONArray json = JSONArray.fromObject(ls);
		System.out.println(json);
	}
	
}
