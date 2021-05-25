package com.revature.autosurvey.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
	public static void main(String[] args) {
		//test for jenkins custom pipeline
		SpringApplication.run(DiscoveryApplication.class, args);
	}

}
