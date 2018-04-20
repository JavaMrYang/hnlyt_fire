package com.hdkj.lyt.hnlyt_fire.model;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
	private int total;
	private String status;
	private List<Task> data = new ArrayList<Task>();
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Task> getData() {
		return data;
	}
	public void setData(List<Task> data) {
		this.data = data;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
