package com.personal.hcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HcmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmApplication.class, args);
	}

}
