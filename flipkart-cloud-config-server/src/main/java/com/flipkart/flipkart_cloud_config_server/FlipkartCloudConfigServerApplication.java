package com.flipkart.flipkart_cloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FlipkartCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartCloudConfigServerApplication.class, args);
	}

}
