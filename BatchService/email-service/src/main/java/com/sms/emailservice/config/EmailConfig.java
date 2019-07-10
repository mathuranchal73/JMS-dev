package com.sms.emailservice.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfig {
	  
	  
	  @Bean
	  public JavaMailSender getJavaMailSender() {
	      JavaMailSenderImpl mailSender = new JavaMailSenderImpl();	 
	        mailSender.setHost("smtp.gmail.com");
	        mailSender.setPort(587);
	        
	        mailSender.setUsername("mathuranchal90@gmail.com");
	        mailSender.setPassword("teleph0nic");
	        
	        Properties props = mailSender.getJavaMailProperties();
	        //props.put("mail.transport.protocol", "smtp");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtps.ssl.checkserveridentity", "true");
	        props.put("mail.smtps.ssl.trust", "*");
	        //props.put("mail.smtp.startssl.enable", "true");
	        props.put("mail.debug", "true");
	      return mailSender;
	  }
	  
	  @Bean
	    public SimpleMailMessage templateSimpleMessage() {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setText("This is the test email template for your email:\n%s\n");
	        return message;
	    }

}
