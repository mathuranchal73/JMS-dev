package com.sms.api.model;

import com.sms.api.model.Email;
import com.sms.api.model.User;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSummary {
	
	private final Long userSummaryId;
	private final User user;
	private final Email email;
	
	
	
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
	public Email getEmail() {
		return email;
	}
	
	

}
