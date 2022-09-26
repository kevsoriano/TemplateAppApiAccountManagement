package com.jkngil.pos.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PosAppApiAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosAppApiAccountManagementApplication.class, args);
	}

}
