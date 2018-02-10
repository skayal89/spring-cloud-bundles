package com.insight.springcloud.SpringConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerApplication {

	/*
		https://howtodoinjava.com/spring/spring-cloud/spring-cloud-config-server-git/
		http://localhost:8888/config-server-client/development
		http://localhost:8888/config-server-client/production
	*/
	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
	}
}
