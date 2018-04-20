package com.hdkj.lyt.hnlyt_fire.model.data;

public class FireData {
	private String time;
	private int fireUploadNo;
	private String fireLevel1 = "0";
	private String fireLevel2 = "0";
	private String fireLevel3 = "0";
	private String fireLevel4 = "0";
	
	public int getFireUploadNo() {
		return fireUploadNo;
	}
	public void setFireUploadNo(int fireUploadNo) {
		this.fireUploadNo = fireUploadNo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getFireLevel1() {
		return fireLevel1;
	}
	public void setFireLevel1(String fireLevel1) {
		this.fireLevel1 = fireLevel1;
	}
	public String getFireLevel2() {
		return fireLevel2;
	}
	public void setFireLevel2(String fireLevel2) {
		this.fireLevel2 = fireLevel2;
	}
	public String getFireLevel3() {
		return fireLevel3;
	}
	public void setFireLevel3(String fireLevel3) {
		this.fireLevel3 = fireLevel3;
	}
	public String getFireLevel4() {
		return fireLevel4;
	}
	public void setFireLevel4(String fireLevel4) {
		this.fireLevel4 = fireLevel4;
	}
}
