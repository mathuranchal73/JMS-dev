package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class User {
	
	private static Long userId;
	private static String userName;
	
	
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


	public static void setUserId(Long userId) {
		User.userId = 100L;
	}


	public static void setUserName(String userName) {
		User.userName = "amathur2";
	}
	
	

}
