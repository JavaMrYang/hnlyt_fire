package com.hdkj.lyt.hnlyt_fire.model;


public class Task {
	private String taskId;//'任务编号',
	private String taskType; // 	string 	任务类型
	private String taskAddTime; // 	string 	任务添加时间
	private String taskLimitTime; // 	string 	任务截止时间
	private String taskCompleteTime; // 	string 	任务完成时间
	private String taskStatus; // 	string 	任务状态
	private String city; // 	string 	任务所在市
	private String taskAddName; // 	string 	任务创建者
	private String taskDesc; // 	string 	任务描述
	private String toName; // 	string 	任务指定接收人
	private String taskCompleteName; // 	string 	任务完成人
	private String taskLatlngs; // 	string 	任务坐标集合
	private String title; // 	string 	任务标题
	private String town; // 	string 	任务所在县
	private String village; // 	string 	任务所在镇
	private String taskRecvName; // 	string 	任务接收人
	private String imageNames; // 	string 	任务图片，多张用“，”隔开
	private String pointType; // 	string 	位置类型。-1：无位置，1：点，2：线，3：面
	private String recvTime;//任务接收时间
	private String result;//任务反馈结果
	private String resultImg;//任务反馈图片
	private String taskObj;
	private String hotId;//火情热点id
	private String backup1;
	

	public String getBackup1() {
		return backup1;
	}
	public void setBackup1(String backup1) {
		this.backup1 = backup1;
	}
	public String getHotId() {
		return hotId;
	}
	public void setHotId(String hotId) {
		this.hotId = hotId;
	}
	public String getTaskObj() {
		return taskObj;
	}
	public void setTaskObj(String taskObj) {
		this.taskObj = taskObj;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getRecvTime() {
		return recvTime;
	}
	public void setRecvTime(String recvTime) {
		this.recvTime = recvTime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResultImg() {
		return resultImg;
	}
	public void setResultImg(String resultImg) {
		this.resultImg = resultImg;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskAddTime() {
		return taskAddTime;
	}
	public void setTaskAddTime(String taskAddTime) {
		this.taskAddTime = taskAddTime;
	}
	public String getTaskLimitTime() {
		return taskLimitTime;
	}
	public void setTaskLimitTime(String taskLimitTime) {
		this.taskLimitTime = taskLimitTime;
	}
	public String getTaskCompleteTime() {
		return taskCompleteTime;
	}
	public void setTaskCompleteTime(String taskCompleteTime) {
		this.taskCompleteTime = taskCompleteTime;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTaskAddName() {
		return taskAddName;
	}
	public void setTaskAddName(String taskAddName) {
		this.taskAddName = taskAddName;
	}
	public String getTaskDesc() {
		return taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String getTaskCompleteName() {
		return taskCompleteName;
	}
	public void setTaskCompleteName(String taskCompleteName) {
		this.taskCompleteName = taskCompleteName;
	}
	public String getTaskLatlngs() {
		return taskLatlngs;
	}
	public void setTaskLatlngs(String taskLatlngs) {
		this.taskLatlngs = taskLatlngs;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getTaskRecvName() {
		return taskRecvName;
	}
	public void setTaskRecvName(String taskRecvName) {
		this.taskRecvName = taskRecvName;
	}
	public String getImageNames() {
		return imageNames;
	}
	public void setImageNames(String imageNames) {
		this.imageNames = imageNames;
	}
	public String getPointType() {
		return pointType;
	}
	public void setPointType(String pointType) {
		this.pointType = pointType;
	}
	

}
