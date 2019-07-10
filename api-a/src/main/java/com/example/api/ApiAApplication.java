package com.example.api;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;



@EnableJms
@SpringBootApplication
public class ApiAApplication extends SpringBootServletInitializer{


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiAApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(ApiAApplication.class, args);

		/**
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Sender sender = context.getBean(Sender.class);

		System.out.println("Preparing to send a message");
        sender.sendMessage("order-queue", "item: 1234, customer: 1234");
		 **/

	}




}
