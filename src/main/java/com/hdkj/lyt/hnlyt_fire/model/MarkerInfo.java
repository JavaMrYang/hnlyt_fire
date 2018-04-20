package com.hdkj.lyt.hnlyt_fire.model;

/**
 * 飞机标注实体
 * @author Administrator
 *
 */
public class MarkerInfo {
	private int id;//序号
	private String drone_lat;//飞机纬度
	private String drone_lng;//飞机经度
	private String drone_height;//飞机高度
	private String target_latlngs;//目标点经纬度
	private String target_size;//目标点个数
	private String marker_time;//标注时间
	private String weather;//天气情况
	private String side_length;//边长
	private String area;//面积
	private String round_length;//周长
	private String img_name;//图片名
	private String marker_postion_desc;//标注点位置描述
	private String marker_desc;//描述
	private String pm25;//PM2.5
	private String pm10;//PM10
	private String tvoc;//TVOC
	private String jiaquan;//甲醛
	private String wendu;//温度
	private String shidu;//湿度
	private String backup1;//备用1
	private String backup2;//备用2
	private String droneType;//飞机型号
	private String user_name;//用户名
	private String type;//标注类型 0点 1线 2面
	private String yaw;//方位角
	private String gimbalYaw;//云台方位角
	private String gimbalPitch;//云台角度
	private String city;//市
	private String town;//县
	private String village;//镇
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDroneType() {
		return droneType;
	}

	public void setDroneType(String droneType) {
		this.droneType = droneType;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
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

	public String getYaw() {
		return yaw;
	}

	public void setYaw(String yaw) {
		this.yaw = yaw;
	}

	public String getGimbalYaw() {
		return gimbalYaw;
	}

	public void setGimbalYaw(String gimbalYaw) {
		this.gimbalYaw = gimbalYaw;
	}

	public String getGimbalPitch() {
		return gimbalPitch;
	}

	public void setGimbalPitch(String gimbalPitch) {
		this.gimbalPitch = gimbalPitch;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrone_lat() {
		return drone_lat;
	}

	public void setDrone_lat(String drone_lat) {
		this.drone_lat = drone_lat;
	}

	public String getDrone_lng() {
		return drone_lng;
	}

	public void setDrone_lng(String drone_lng) {
		this.drone_lng = drone_lng;
	}

	public String getDrone_height() {
		return drone_height;
	}

	public void setDrone_height(String drone_height) {
		this.drone_height = drone_height;
	}

	public String getTarget_latlngs() {
		return target_latlngs;
	}

	public void setTarget_latlngs(String target_latlngs) {
		this.target_latlngs = target_latlngs;
	}

	public String getTarget_size() {
		return target_size;
	}

	public void setTarget_size(String target_size) {
		this.target_size = target_size;
	}

	public String getMarker_time() {
		return marker_time;
	}

	public void setMarker_time(String marker_time) {
		this.marker_time = marker_time;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getSide_length() {
		return side_length;
	}

	public void setSide_length(String side_length) {
		this.side_length = side_length;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRound_length() {
		return round_length;
	}

	public void setRound_length(String round_length) {
		this.round_length = round_length;
	}

	public String getImg_name() {
		return img_name;
	}

	public void setImg_name(String img_name) {
		this.img_name = img_name;
	}

	public String getMarker_postion_desc() {
		return marker_postion_desc;
	}

	public void setMarker_postion_desc(String marker_postion_desc) {
		this.marker_postion_desc = marker_postion_desc;
	}

	public String getMarker_desc() {
		return marker_desc;
	}

	public void setMarker_desc(String marker_desc) {
		this.marker_desc = marker_desc;
	}

	public String getPm25() {
		return pm25;
	}

	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}

	public String getPm10() {
		return pm10;
	}

	public void setPm10(String pm10) {
		this.pm10 = pm10;
	}

	public String getTvoc() {
		return tvoc;
	}

	public void setTvoc(String tvoc) {
		this.tvoc = tvoc;
	}

	public String getJiaquan() {
		return jiaquan;
	}

	public void setJiaquan(String jiaquan) {
		this.jiaquan = jiaquan;
	}

	public String getWendu() {
		return wendu;
	}

	public void setWendu(String wendu) {
		this.wendu = wendu;
	}

	public String getShidu() {
		return shidu;
	}

	public void setShidu(String shidu) {
		this.shidu = shidu;
	}

	public String getBackup1() {
		return backup1;
	}

	public void setBackup1(String backup1) {
		this.backup1 = backup1;
	}

	public String getBackup2() {
		return backup2;
	}

	public void setBackup2(String backup2) {
		this.backup2 = backup2;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}
