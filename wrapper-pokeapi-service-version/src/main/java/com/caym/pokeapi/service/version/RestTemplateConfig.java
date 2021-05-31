package com.caym.pokeapi.service.version;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Bean("registerRestTemplate")
	public RestTemplate registerRestTemplate() {
		return new RestTemplate();
	}

}