package com.hdkj.lyt.hnlyt_fire.model.data;

/**
 * 其他数据上报集 护林员上报的，除了森林火灾
 * @author Administrator
 *
 */
public class OtherData {
	private String time;
	private String city;
	private int total;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
