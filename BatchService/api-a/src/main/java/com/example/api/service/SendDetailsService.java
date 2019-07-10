package com.example.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.example.api.model.UserSummary;

@Service
public class SendDetailsService {
	

	private static final String SEND_EMAIL_QUEUE="email.queue";
	
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void send(UserSummary userSummary) {
		jmsTemplate.convertAndSend(SEND_EMAIL_QUEUE,userSummary);
	}
	

}
