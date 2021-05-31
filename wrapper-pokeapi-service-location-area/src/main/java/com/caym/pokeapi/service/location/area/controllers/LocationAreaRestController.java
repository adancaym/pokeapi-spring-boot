package com.caym.pokeapi.service.location.area.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caym.pokeapi.models.locations.locationAreas.LocationArea;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;
import com.caym.pokeapi.service.location.area.services.LocationAreaService;

@RestController
public class LocationAreaRestController {

	@Autowired 
	LocationAreaService service;
	
	@GetMapping("/")
	public NamedAPIResourceList index(@RequestParam(required=false) Map<String,String> qparams){
		return service.Index(qparams);
	}

	@GetMapping("/{idOrName}")
	public LocationArea IdOrName(@PathVariable String idOrName){
		return service.IdOrName(idOrName);
	}
	
}
