package com.hdkj.lyt.hnlyt_fire.model;

import java.util.HashMap;
import java.util.Map;

public class DroneState extends S3{
	private String ip;//app端的IP
	private String id;//中文名用于显示
	private String publishName;//推流名
	private String homeLatitude;//家纬度
	private String homeLongitude;//家经度
	
	private String droneLatitude;//飞机纬度
	private String droneLongitude;//飞机经度
	
	private String userLatitude;//手机端纬度
	private String userLongitude;//手机端经度
	private String userHeight;//中心点的经度
	private String userDegree;//中心点的维度
	private String liveModle;//直播模式  0飞机直播  1手机直播
	
	private String speed;//速度
	private String velocityX;//速率X
	private String velocityY;//速率Y
	private String velocityZ;//速率Z
	private String pitch;//俯仰角
	private String roll;//翻滚角
	private String yaw;//方位角
	private String remainPower;//电量
	private String altitude;//相对高度
	private String desc;//事件描述
	private String isPublish;//是否在推流
	
	private String areaName;//区域+名字
	private String city;//市
	private String town;//县
	private String village;//镇
	private String onLineTime;//上线时间
	private String groupId;//分组
	
	
	//连接状态：遥控与飞机的连接状态
	//推流名
	//摄像头的俯仰角度
	//摄像头的方位角，精灵没有
	//海拔高度，手机的海拔高度+飞机的气压高度，判断手机的卫星数必须大于6，否则海拔高度无效。
	//机型
	//操作员
	//卫星数量，手机端和飞机
	//工作内容
	//终端类型
	//当时天气、调用天气接口
//	private String ;//手机端纬度
//	private String ;//手机端经度
//	private String ;//手机海拔高度
//	private String ;//手机gps精度
	
	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		String str = "{\"homeLatitude\":\""+homeLatitude+"\"," +
				"\"homeLongitude\":\""+homeLongitude+"\"," +
				"\"id\":\""+id+"\"," +
				"\"publishName\":\""+publishName+"\"," +
				"\"droneLatitude\":\""+droneLatitude+"\"," +
				"\"droneLongitude\":\""+droneLongitude+"\"," +
				"\"speed\":\""+speed+"\"," +
				"\"desc\":\""+desc+"\"," +
				
				"\"liveModle\":\""+liveModle+"\"," +
				
				"\"userLatitude\":\""+userLatitude+"\"," +
				"\"userLongitude\":\""+userLongitude+"\"," +
				"\"userHeight\":\""+userHeight+"\"," +
				"\"userDegree\":\""+userDegree+"\"," +
				
				"\"velocityX\":\""+velocityX+"\"," +
				"\"velocityY\":\""+velocityY+"\"," +
				"\"velocityZ\":\""+velocityZ+"\"," +
				"\"pitch\":\""+pitch+"\"," +
				"\"roll\":\""+roll+"\"," +
				"\"yaw\":\""+yaw+"\"," +
				"\"remainPower\":\""+remainPower+"\"," +
				"\"altitude\":\""+altitude+"\"," +
				"\"isPublish\":\""+isPublish+"\"," +
				//S3空气传感器
				"\"pm25\":\""+pm25+"\"," +
				"\"pm10\":\""+pm10+"\"," +
				"\"shidu\":\""+shidu+"\"," +
				"\"wendu\":\""+wendu+"\"," +
				"\"jiaquan\":\""+jiaquan+"\"," +
				"\"tvoc\":\""+tvoc+"\"," +
				"\"ip\":\""+ip+"\"" +
						"}";
		return str;
	}
	
	public String getOnLineTime() {
		return onLineTime;
	}

	public void setOnLineTime(String onLineTime) {
		this.onLineTime = onLineTime;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public static void main(String[] args) {
		Map<String,DroneState> clientMaps = new HashMap<String,DroneState>();
		
		DroneState d1 = new DroneState();
//		DroneState d2 = new DroneState();
//		DroneState d3 = new DroneState();
//		DroneState d4 = new DroneState();
//		
//		clientMaps.put("\""+"127.0.0.1"+"\"", d1);
//		clientMaps.put("\""+"127.0.0.2"+"\"", d2);
//		clientMaps.put("\""+"127.0.0.3"+"\"", d3);
//		clientMaps.put("\""+"127.0.0.4"+"\"", d4);
		
		System.out.println(d1.toString());
	}
	
	
	
	public String getIsPublish() {
		return isPublish;
	}
	public void setIsPublish(String isPublish) {
		this.isPublish = isPublish;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLiveModle() {
		return liveModle;
	}
	public void setLiveModle(String liveModle) {
		this.liveModle = liveModle;
	}
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public String getUserLatitude() {
		return userLatitude;
	}
	public void setUserLatitude(String userLatitude) {
		this.userLatitude = userLatitude;
	}
	public String getUserLongitude() {
		return userLongitude;
	}
	public void setUserLongitude(String userLongitude) {
		this.userLongitude = userLongitude;
	}
	public String getUserHeight() {
		return userHeight;
	}
	public void setUserHeight(String userHeight) {
		this.userHeight = userHeight;
	}
	public String getUserDegree() {
		return userDegree;
	}
	public void setUserDegree(String userDegree) {
		this.userDegree = userDegree;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHomeLatitude() {
		return homeLatitude;
	}
	public void setHomeLatitude(String homeLatitude) {
		this.homeLatitude = homeLatitude;
	}
	public String getHomeLongitude() {
		return homeLongitude;
	}
	public void setHomeLongitude(String homeLongitude) {
		this.homeLongitude = homeLongitude;
	}
	public String getDroneLatitude() {
		return droneLatitude;
	}
	public void setDroneLatitude(String droneLatitude) {
		this.droneLatitude = droneLatitude;
	}
	public String getDroneLongitude() {
		return droneLongitude;
	}
	public void setDroneLongitude(String droneLongitude) {
		this.droneLongitude = droneLongitude;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getVelocityX() {
		return velocityX;
	}
	public void setVelocityX(String velocityX) {
		this.velocityX = velocityX;
	}
	public String getVelocityY() {
		return velocityY;
	}
	public void setVelocityY(String velocityY) {
		this.velocityY = velocityY;
	}
	public String getVelocityZ() {
		return velocityZ;
	}
	public void setVelocityZ(String velocityZ) {
		this.velocityZ = velocityZ;
	}
	public String getPitch() {
		return pitch;
	}
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getYaw() {
		return yaw;
	}
	public void setYaw(String yaw) {
		this.yaw = yaw;
	}
	public String getRemainPower() {
		return remainPower;
	}
	public void setRemainPower(String remainPower) {
		this.remainPower = remainPower;
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
}
