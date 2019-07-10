package com.sms.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.sms.api.model.UserSummary;

@Service
public class ReceiveDetailsService {

	private static final Logger LOGGER=LoggerFactory.getLogger(ReceiveDetailsService.class);
	
	@JmsListener(destination="email.queue")
	public void receive(UserSummary userSummary) {
		
		LOGGER.info("Received a message");
		LOGGER.info("Message Received is==="+ userSummary);
		
		
	}
}
