package com.revature.models;

public class User {
	
	private String username;
	private String password;
	private boolean adminAccess;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, boolean adminAccess) {
		super();
		this.username = username;
		this.password = password;
		this.adminAccess = adminAccess;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdminAccess() {
		return adminAccess;
	}
	public void setAdminAccess(boolean adminAccess) {
		this.adminAccess = adminAccess;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", adminAccess=" + adminAccess + "]";
	}
	
	

}
