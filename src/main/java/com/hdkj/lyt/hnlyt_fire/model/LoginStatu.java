package com.hdkj.lyt.hnlyt_fire.model;

import com.hdkj.lyt.hnlyt_fire.model.data.LoginData;

/**
 * 用户登录状态
 * @author Administrator
 *
 */
public class LoginStatu {
	private String status;
	private LoginData data;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LoginData getData() {
		return data;
	}
	public void setData(LoginData data) {
		this.data = data;
	}
	
}
