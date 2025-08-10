package com.ecommerce.flipkart_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FlipkartServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartServiceRegistryApplication.class, args);
	}

}
