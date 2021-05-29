package com.caym.pokeapi.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class WrapperPokeapiConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(WrapperPokeapiConfigServerApplication.class, args);
	}

}
