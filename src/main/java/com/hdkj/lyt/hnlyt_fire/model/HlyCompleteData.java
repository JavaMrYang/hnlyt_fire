package com.hdkj.lyt.hnlyt_fire.model;

/**
 * 护林员任务完成情况
 * @author Administrator
 *
 */
public class HlyCompleteData {
	private String city;
	private String time;
	private int total;
	private String type;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
