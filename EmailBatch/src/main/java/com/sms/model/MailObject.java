package com.sms.model;

public class MailObject {
	
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
    
	@Override
	public String toString() {
		return "MailObject [toemail=" + toemail + ", subject=" + subject + ", text=" + text + "]";
	}

}
