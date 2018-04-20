package com.hdkj.lyt.hnlyt_fire.model;

import javax.persistence.*;

/**
 * 国家林业局发布火点热点
 * @author Administrator
 *
 */
@Entity
@Table(name = "tb_FireHot")
public class FireHot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String latlng;
	private String addTime;
	private String addName;
	private String completeTime;
	private String recvName;
	private String content;
	private String images;
	private String city;
	private String town;
	private String recvTime;
	private String isFire;
	private String status;
	private String addDate;
	private String smoke;//是否有烟
	private String type;//林火所在地类
	private String px;//像素数
	private String hotNo;//热点编号
	
	
	
	public String getHotNo() {
		return hotNo;
	}
	public void setHotNo(String hotNo) {
		this.hotNo = hotNo;
	}
	public String getSmoke() {
		return smoke;
	}
	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPx() {
		return px;
	}
	public void setPx(String px) {
		this.px = px;
	}
	public String getAddDate() {
		return addDate;
	}
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddName() {
		return addName;
	}
	public void setAddName(String addName) {
		this.addName = addName;
	}
	public String getLatlng() {
		return latlng;
	}
	public void setLatlng(String latlng) {
		this.latlng = latlng;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	public String getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(String completeTime) {
		this.completeTime = completeTime;
	}
	public String getRecvName() {
		return recvName;
	}
	public void setRecvName(String recvName) {
		this.recvName = recvName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
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
	public String getRecvTime() {
		return recvTime;
	}
	public void setRecvTime(String recvTime) {
		this.recvTime = recvTime;
	}
	public String getIsFire() {
		return isFire;
	}
	public void setIsFire(String isFire) {
		this.isFire = isFire;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
