package com.Server.DockerEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DockerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerEurekaApplication.class, args);
	}

}
