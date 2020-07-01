package com.microservice.practice.assessmentuser;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AssessementUserApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
		
	public static void main(String[] args) {
		SpringApplication.run(AssessementUserApplication.class, args);
	}

}
