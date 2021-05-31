package com.caym.pokeapi.service.pokemon.color.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.pokemonColors.PokemonColor;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PokemonColorService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	PokemonColor IdOrName(String idOrName);
}
