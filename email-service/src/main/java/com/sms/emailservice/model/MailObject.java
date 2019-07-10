package com.sms.emailservice.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MailObject {

	@Email
    @NotNull
    @Size(min = 1, message = "Please, set an email address to send the message to it")
	private String toemail;	
	
	private String subject;
    private String text;
    
    
public MailObject() {
    	
    }

    public MailObject(String toemail, String subject, String text) {
		super();
		this.toemail = toemail;
		this.subject = subject;
		this.text = text;
	}
    
    
    public String gettoemail() {
		return toemail;
	}
	
    public void settoemail(String toemail) {
		this.toemail = toemail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
    
    
}
