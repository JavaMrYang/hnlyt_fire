package com.hdkj.lyt.hnlyt_fire.model;

public class Village {
	private int id;
	private int pid;
	private String vilageName;
	public Village(int townId, String village) {
		this.pid = townId;
		this.vilageName = village;
	}
	public Village(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getVilageName() {
		return vilageName;
	}
	public void setVilageName(String vilageName) {
		this.vilageName = vilageName;
	}
	
}
