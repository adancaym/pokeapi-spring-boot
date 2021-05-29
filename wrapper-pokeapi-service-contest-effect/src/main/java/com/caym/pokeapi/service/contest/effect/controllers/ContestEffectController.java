package com.caym.pokeapi.service.contest.effect.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caym.pokeapi.models.berries.berryFlavors.BerryFlavor;
import com.caym.pokeapi.models.contest.contestEffects.ContestEffect;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;
import com.caym.pokeapi.service.contest.effect.service.ContestEffectService;

@RestController
public class ContestEffectController {

	@Autowired 
	ContestEffectService service;
	
	@GetMapping("/")
	public NamedAPIResourceList index(@RequestParam(required=false) Map<String,String> qparams){
		return service.Index(qparams);
	}

	@GetMapping("/{idOrName}")
	public ContestEffect IdOrName(@PathVariable String idOrName){
		return service.IdOrName(idOrName);
	}
}
