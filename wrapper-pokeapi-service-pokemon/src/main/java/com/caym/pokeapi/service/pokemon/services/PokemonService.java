package com.caym.pokeapi.service.pokemon.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.pokemon.Pokemon;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PokemonService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Pokemon IdOrName(String idOrName);
}
