package com.sms.api.model;

public class User {
	
	private final Long userId;
	private final String userName;
	
	
	public User(Long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	
	public Long getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	
	

}
