package com.money.xfgl.user.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String userName;
	private String password;
	private String state;
	
	public static String USER_STATE_ADMIN = "1"; //超级用户
	public static String USER_STATE_UNADMIN = "0";
	
	public User() {
	}

	public User(String id, String userName, String password, String state) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
