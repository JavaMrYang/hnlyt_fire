package com.hdkj.lyt.hnlyt_fire.model.data;

/**
 * 卫星热点返回集
 * @author Administrator
 *
 */
public class HotReturnData {
	private String time;
	private int total;
	private int status0;
	private int status1;
	private int status2;
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
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
	public int getStatus0() {
		return status0;
	}
	public void setStatus0(int status0) {
		this.status0 = status0;
	}
	public int getStatus1() {
		return status1;
	}
	public void setStatus1(int status1) {
		this.status1 = status1;
	}
	public int getStatus2() {
		return status2;
	}
	public void setStatus2(int status2) {
		this.status2 = status2;
	}
	
}
