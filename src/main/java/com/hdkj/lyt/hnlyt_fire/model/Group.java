package com.hdkj.lyt.hnlyt_fire.model;

public class Group {
	private int id;
	private String groupName;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{")
		.append("\"id\":")
		.append(id)
		.append(",\"groupName\":")
		.append("\"")
		.append(groupName)
		.append("\"")
		.append("}");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Group());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
}
