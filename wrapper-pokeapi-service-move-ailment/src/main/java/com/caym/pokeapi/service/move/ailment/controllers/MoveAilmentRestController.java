package com.caym.pokeapi.service.move.ailment.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caym.pokeapi.models.moves.moveAilments.MoveAilment;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;
import com.caym.pokeapi.service.move.ailment.services.MoveAilmentService;

@RestController
public class MoveAilmentRestController {

	@Autowired 
	MoveAilmentService service;
	
	@GetMapping("/")
	public NamedAPIResourceList index(@RequestParam(required=false) Map<String,String> qparams){
		return service.Index(qparams);
	}

	@GetMapping("/{idOrName}")
	public MoveAilment IdOrName(@PathVariable String idOrName){
		return service.IdOrName(idOrName);
	}
	
}
