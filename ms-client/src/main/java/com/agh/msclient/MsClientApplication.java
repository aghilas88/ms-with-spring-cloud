package com.agh.msclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.agh.msclient")
@EnableDiscoveryClient
public class MsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClientApplication.class, args);
	}

}
