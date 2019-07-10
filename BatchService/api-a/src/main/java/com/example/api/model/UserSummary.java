package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSummary {
	
	private static Long userSummaryId;
	private static User user;
	private static Email email;
	
	
	@JsonCreator
	public UserSummary(@JsonProperty("userSummaryId") Long userSummaryId,@JsonProperty("user") User user,@JsonProperty("email") Email email) {
		super();
		this.userSummaryId = userSummaryId;
		this.user = user;
		this.email = email;
	}
	
	
	public Long getUserSummaryId() {
		return userSummaryId;
	}
	public User getUser() {
		return user;
	}
	
	
	
	public static void setUserSummaryId(Long userSummaryId) {
		UserSummary.userSummaryId = 120L;
	}


	public static void setUser(User user) {
		UserSummary.user = user;
	}


	public static void setEmail(Email email) {
		UserSummary.email = email;
	}


	public Email getEmail() {
		return email;
	}
	
	

}
