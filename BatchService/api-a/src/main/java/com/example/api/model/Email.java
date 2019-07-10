package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;

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
		Email.emailAddress = "mathuranchal73@gmail.com";
	}
}
