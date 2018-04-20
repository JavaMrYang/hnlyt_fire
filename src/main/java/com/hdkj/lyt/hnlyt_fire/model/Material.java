package com.hdkj.lyt.hnlyt_fire.model;

/**
 * 物资储备信息
 * 
 * @author Administrator
 * 
 */
public class Material {
	private String id;
	private String latlng;// 位置
	private String buildTime;// 成立时间
	private String inputTime;// 录入时间
	private String buildArea;// 建设面积，平方米
	private String manager;// 管理人
	private String job;// 职务
	private String phone;// 电话
	private String gps;// GPS
	private String yj;// 油锯
	private String sb;// 水泵
	private String df;// 大斧
	private String kd;// 砍刀
	private String fz;// 服装
	private String zp;// 帐篷
	private String sd;// 睡袋
	private String qt;// 其他
	private String wrj;// 无人机
	private String ggj;// 割灌机
	private String fsy;// 风速仪
	private String xfc;// 消防铲
	private String fdj;// 发电机
	private String dhj;// 点火机
	private String inputName;
	private String mhsc;// 灭火水车

	private String eshgj;// 二三号工具
	private String flmhj;// 风力灭火机
	private String yhtcy;// 余火探测仪
	private String scdjj;// 手持对讲机
	private String fsmhj;// 风水灭火机
	private String gyxswmhj;// 高压细水雾灭火机
	private String desc;// 描述
	private String images;// 图片，多张用逗号隔开
	private String txc;//通讯车
	private String czt;//车载台
	private String ybc;//运兵车
	private String mhsq;//灭火水枪
	private String city;//市
	private String town;//县
	private String village;//镇
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

	public String getTxc() {
		return txc;
	}

	public void setTxc(String txc) {
		this.txc = txc;
	}

	public String getCzt() {
		return czt;
	}

	public void setCzt(String czt) {
		this.czt = czt;
	}

	public String getYbc() {
		return ybc;
	}

	public void setYbc(String ybc) {
		this.ybc = ybc;
	}

	public String getMhsq() {
		return mhsq;
	}

	public void setMhsq(String mhsq) {
		this.mhsq = mhsq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLatlng() {
		return latlng;
	}

	public void setLatlng(String latlng) {
		this.latlng = latlng;
	}

	public String getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}

	public String getInputTime() {
		return inputTime;
	}

	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}

	public String getBuildArea() {
		return buildArea;
	}

	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
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

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getYj() {
		return yj;
	}

	public void setYj(String yj) {
		this.yj = yj;
	}

	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb;
	}

	public String getDf() {
		return df;
	}

	public void setDf(String df) {
		this.df = df;
	}

	public String getKd() {
		return kd;
	}

	public void setKd(String kd) {
		this.kd = kd;
	}

	public String getFz() {
		return fz;
	}

	public void setFz(String fz) {
		this.fz = fz;
	}

	public String getZp() {
		return zp;
	}

	public void setZp(String zp) {
		this.zp = zp;
	}

	public String getSd() {
		return sd;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}

	public String getQt() {
		return qt;
	}

	public void setQt(String qt) {
		this.qt = qt;
	}

	public String getWrj() {
		return wrj;
	}

	public void setWrj(String wrj) {
		this.wrj = wrj;
	}

	public String getGgj() {
		return ggj;
	}

	public void setGgj(String ggj) {
		this.ggj = ggj;
	}

	public String getFsy() {
		return fsy;
	}

	public void setFsy(String fsy) {
		this.fsy = fsy;
	}

	public String getXfc() {
		return xfc;
	}

	public void setXfc(String xfc) {
		this.xfc = xfc;
	}

	public String getFdj() {
		return fdj;
	}

	public void setFdj(String fdj) {
		this.fdj = fdj;
	}

	public String getDhj() {
		return dhj;
	}

	public void setDhj(String dhj) {
		this.dhj = dhj;
	}

	public String getMhsc() {
		return mhsc;
	}

	public void setMhsc(String mhsc) {
		this.mhsc = mhsc;
	}

	public String getEshgj() {
		return eshgj;
	}

	public void setEshgj(String eshgj) {
		this.eshgj = eshgj;
	}

	public String getFlmhj() {
		return flmhj;
	}

	public void setFlmhj(String flmhj) {
		this.flmhj = flmhj;
	}

	public String getYhtcy() {
		return yhtcy;
	}

	public void setYhtcy(String yhtcy) {
		this.yhtcy = yhtcy;
	}

	public String getScdjj() {
		return scdjj;
	}

	public void setScdjj(String scdjj) {
		this.scdjj = scdjj;
	}

	public String getFsmhj() {
		return fsmhj;
	}

	public void setFsmhj(String fsmhj) {
		this.fsmhj = fsmhj;
	}

	public String getGyxswmhj() {
		return gyxswmhj;
	}

	public void setGyxswmhj(String gyxswmhj) {
		this.gyxswmhj = gyxswmhj;
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

}
