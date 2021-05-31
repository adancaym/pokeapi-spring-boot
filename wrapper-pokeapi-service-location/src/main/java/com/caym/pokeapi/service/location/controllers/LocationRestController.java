package com.caym.pokeapi.service.location.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caym.pokeapi.models.locations.locations.Location;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;
import com.caym.pokeapi.service.location.services.LocationService;

@RestController
public class LocationRestController {

	@Autowired 
	LocationService service;
	
	@GetMapping("/")
	public NamedAPIResourceList index(@RequestParam(required=false) Map<String,String> qparams){
		return service.Index(qparams);
	}

	@GetMapping("/{idOrName}")
	public Location IdOrName(@PathVariable String idOrName){
		return service.IdOrName(idOrName);
	}
	
}
