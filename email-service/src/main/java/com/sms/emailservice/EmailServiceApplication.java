package com.sms.emailservice;

import static springfox.documentation.builders.PathSelectors.any;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class EmailServiceApplication {
	
	@Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("Email").select()
                .apis(RequestHandlerSelectors.basePackage("com.sms.emailservice"))
                .paths(any()).build().apiInfo(new ApiInfo("Reservation Services",
                        "A set of services to provide data access to reservations", "1.0.0", null,
                        new Contact("Anchal Mathur", "https://www.linkedin.com/in/anchal-mathur-1007931b/", null),null, null));
    }

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
