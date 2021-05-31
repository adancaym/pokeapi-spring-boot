package com.caym.pokeapi.service.pokemon.species.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.pokemonSpecies.PokemonSpecies;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PokemonSpeciesService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	PokemonSpecies IdOrName(String idOrName);
}
