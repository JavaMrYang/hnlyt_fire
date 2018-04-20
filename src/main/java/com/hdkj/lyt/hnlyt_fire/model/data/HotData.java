package com.hdkj.lyt.hnlyt_fire.model.data;

/**
 * 热点查询结果集
 * @author Administrator
 *
 */
public class HotData {
	private String town;
	private int total;
	private String time;
	private int status;
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
