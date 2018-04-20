package com.hdkj.lyt.hnlyt_fire.model;

import java.sql.Timestamp;

/**
 * 空气质量
 * @author huangjz
 *
 */
public class AirQuality {
	private String publishName;//推流名  设备唯一标识
	private Timestamp runTime;
	private String pm25;//pm2.5
	private String pm10;//pm10
	private String tvoc;//
	private String shidu;//湿度
	private String wendu;//温度
	private String jiaquan;//甲醛
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public Timestamp getRunTime() {
		return runTime;
	}
	public void setRunTime(Timestamp runTime) {
		this.runTime = runTime;
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
	public String getShidu() {
		return shidu;
	}
	public void setShidu(String shidu) {
		this.shidu = shidu;
	}
	public String getWendu() {
		return wendu;
	}
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	public String getJiaquan() {
		return jiaquan;
	}
	public void setJiaquan(String jiaquan) {
		this.jiaquan = jiaquan;
	}
}
