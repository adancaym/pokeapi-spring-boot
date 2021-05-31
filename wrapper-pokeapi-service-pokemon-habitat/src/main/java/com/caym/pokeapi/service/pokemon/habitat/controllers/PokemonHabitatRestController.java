package com.caym.pokeapi.service.pokemon.habitat.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caym.pokeapi.models.pokemon.pokemonHabitats.PokemonHabitat;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;
import com.caym.pokeapi.service.pokemon.habitat.services.PokemonHabitatService;

@RestController
public class PokemonHabitatRestController {

	@Autowired 
	PokemonHabitatService service;
	
	@GetMapping("/")
	public NamedAPIResourceList index(@RequestParam(required=false) Map<String,String> qparams){
		return service.Index(qparams);
	}

	@GetMapping("/{idOrName}")
	public PokemonHabitat IdOrName(@PathVariable String idOrName){
		return service.IdOrName(idOrName);
	}
	
}
