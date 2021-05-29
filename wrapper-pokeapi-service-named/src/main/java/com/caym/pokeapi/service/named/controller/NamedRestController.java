package com.caym.pokeapi.service.named.controller;

import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;
import com.caym.pokeapi.service.named.services.NamedService;

@RestController
public class NamedRestController {

	private static final Logger logger = LoggerFactory.getLogger(NamedRestController.class);
	@Autowired
	NamedService namedService;
	
	@GetMapping("/{endpoint}")
	NamedAPIResourceList named(@PathVariable String endpoint, @RequestParam(required=false) Map<String,String> qparams) {
		return namedService.named(endpoint, qparams);
	}
}
