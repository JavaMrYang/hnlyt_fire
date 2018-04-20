package com.hdkj.lyt.hnlyt_fire.model;

/**
 * 瞭望塔
 * 
 * @author Administrator
 * 
 */
public class Tower {
	private String id;
	private String city;//市
	private String town;//县
	private String village;//镇
	private String latlng;//位置
	private String buildMonth;//建设月份 2018-09
	private String cun;//村
	private String height;//高度
	private String altitude;//海拔高度
	private String radius;//覆盖半径
	private String eqps;//装载设备
	private String desc;//描述
	private String images;//图片
	private String inputTime;//录入时间
	private String inputName;//录入者
	private String manager;//管理者
	private String phone;//电话
	private int type;
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getLatlng() {
		return latlng;
	}

	public void setLatlng(String latlng) {
		this.latlng = latlng;
	}

	public String getBuildMonth() {
		return buildMonth;
	}

	public void setBuildMonth(String buildMonth) {
		this.buildMonth = buildMonth;
	}

	public String getCun() {
		return cun;
	}

	public void setCun(String cun) {
		this.cun = cun;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getEqps() {
		return eqps;
	}

	public void setEqps(String eqps) {
		this.eqps = eqps;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getInputTime() {
		return inputTime;
	}

	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}

	
}
