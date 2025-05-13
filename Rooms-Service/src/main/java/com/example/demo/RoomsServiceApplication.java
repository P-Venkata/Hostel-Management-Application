package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.demo.Feign_Client")
public class RoomsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomsServiceApplication.class, args);
	}

}
