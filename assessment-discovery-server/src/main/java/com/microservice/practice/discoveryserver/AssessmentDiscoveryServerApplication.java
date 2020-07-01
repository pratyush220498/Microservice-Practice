package com.microservice.practice.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AssessmentDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentDiscoveryServerApplication.class, args);
	}

}
