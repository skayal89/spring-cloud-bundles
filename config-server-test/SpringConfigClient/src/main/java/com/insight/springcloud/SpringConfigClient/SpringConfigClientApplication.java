package com.insight.springcloud.SpringConfigClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConfigClientApplication {

    /*
		https://howtodoinjava.com/spring/spring-cloud/spring-cloud-config-server-git/
		http://localhost:8080/msg
		http://localhost:8080/refresh [POST]
	*/

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication.class, args);
	}
}
