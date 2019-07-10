package com.sms.api.model;


public class Email {
	
	private static String emailAddress;



	public Email(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}



	public String getEmailAddress() {
		return emailAddress;
	}
	
	public static void setEmailAddress(String emailAddress) {
		Email.emailAddress = emailAddress;
	}
}
