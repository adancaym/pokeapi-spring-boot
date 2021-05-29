package com.caym.pokeapi.service.contest.type;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class WrapperPokeapiServiceContestTypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WrapperPokeapiServiceContestTypeApplication.class, args);
	}

}
