package com.caym.pokeapi.service.pokemon.habitat.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.pokemonHabitats.PokemonHabitat;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PokemonHabitatService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	PokemonHabitat IdOrName(String idOrName);
}
