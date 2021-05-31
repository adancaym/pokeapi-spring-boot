package com.caym.pokeapi.service.move.battle.style.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caym.pokeapi.models.moves.moveAilments.MoveBattleStyle;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;
import com.caym.pokeapi.service.move.battle.style.services.MoveBattleStyleService;

@RestController
public class MoveBattleStyleRestController {

	@Autowired 
	MoveBattleStyleService service;
	
	@GetMapping("/")
	public NamedAPIResourceList index(@RequestParam(required=false) Map<String,String> qparams){
		return service.Index(qparams);
	}

	@GetMapping("/{idOrName}")
	public MoveBattleStyle IdOrName(@PathVariable String idOrName){
		return service.IdOrName(idOrName);
	}
	
}
