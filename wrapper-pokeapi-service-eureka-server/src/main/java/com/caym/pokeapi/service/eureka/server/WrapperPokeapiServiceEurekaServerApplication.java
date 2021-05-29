package com.caym.pokeapi.service.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WrapperPokeapiServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WrapperPokeapiServiceEurekaServerApplication.class, args);
	}

}
