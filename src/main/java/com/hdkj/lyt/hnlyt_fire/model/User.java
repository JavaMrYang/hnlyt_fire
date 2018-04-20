package com.hdkj.lyt.hnlyt_fire.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_User")
public class User {
	
	private String publishName;//推流名  设备唯一标识   由用户名_类型
	@Id
	@Column(name = "name",length = 15)
	private String name;//姓名，允许重复
	private String type;//终端类型，0 飞机  1 手机
	private String pwd;//密码
	private String character;//角色
	private String groupId;//分组ID 0护林员  1森林防火员 2...
	private String registDate;//注册日期
	private String backup1;//备用字段1
	private String backup2;//备用字段2
	private String backup3;//备用字段3
	private String province;//
	private int userLevel;//用户级别
	private String city;//市
	private String town;//县
	private String street;//街道
	private String phone;//手机号，唯一
	private String appType;//app类型 0森林防火 1 护林员
	private String job;//职务
	private String imgHead;//头像
	private String validate;//验证 0已验证 1 未验证
	private String status; //状态-1停用 0启用
	private String planeNo;//飞机型号
	private String location; //位置
	private String serialNum;//序列号
	private String planeImg; //无人机图像
	private String isFly;//是否齐飞
	private String isOnline;  //是否在线

	@OneToMany(mappedBy = "user")
	private Set<FireUploadTable> fireUploadTables;

	public Set<FireUploadTable> getFireUploadTables() {
		return fireUploadTables;
	}

	public void setFireUploadTables(Set<FireUploadTable> fireUploadTables) {
		this.fireUploadTables = fireUploadTables;
	}

	public String getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getPlaneImg() {
		return planeImg;
	}

	public void setPlaneImg(String planeImg) {
		this.planeImg = planeImg;
	}

	public String getIsFly() {
		return isFly;
	}

	public void setIsFly(String isFly) {
		this.isFly = isFly;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPlaneNo() {
		return planeNo;
	}

	public void setPlaneNo(String planeNo) {
		this.planeNo = planeNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User(){}
	
	public User(String[] data) {
//		3	33	李畋	吴名中	18473370012	123456	1	1	1	1	护林员	3
		this.city = data[0];
		this.town = data[1];
		this.street = data[2];
		this.name = data[3];
		this.phone = data[4];
		this.pwd = data[5];
		this.type = data[6];
		this.character = data[7];
		this.groupId = data[8];
		this.appType = data[9];
		this.job = data[10];
		this.userLevel = Integer.parseInt(data[11]);
		this.status=data[12];
	}
	public String getValidate() {
		return validate;
	}
	public void setValidate(String validate) {
		this.validate = validate;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getImgHead() {
		return imgHead;
	}
	public void setImgHead(String imgHead) {
		this.imgHead = imgHead;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
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
	public String getBackup3() {
		return backup3;
	}
	public void setBackup3(String backup3) {
		this.backup3 = backup3;
	}
	
	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
