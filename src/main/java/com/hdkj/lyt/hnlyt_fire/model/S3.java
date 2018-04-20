package com.hdkj.lyt.hnlyt_fire.model;

/**
 * 空气质量传感器 S3系列
 * @author huangjz
 *
 */
public class S3 {
	private String publishName;//推流名  设备唯一标识
	protected String pm25;//pm2.5
	protected String pm10;//pm10
	protected String tvoc;//
	protected String shidu;//湿度
	protected String wendu;//温度
	protected String jiaquan;//甲醛
	
	public S3() {
	}
	public S3(String pm25, String pm10, String tvoc, String shidu,
			String wendu, String jiaquan) {
		this.pm25 = pm25;
		this.pm10 = pm10;
		this.tvoc = tvoc;
		this.shidu = shidu;
		this.wendu = wendu;
		this.jiaquan = jiaquan;
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
