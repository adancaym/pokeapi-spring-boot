package com.caym.pokeapi.service.pokeathlon.stat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class WrapperPokeapiServicePokeathlonStatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WrapperPokeapiServicePokeathlonStatApplication.class, args);
	}

}
