package com.caym.pokeapi.service.pokemon.shape.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.pokemonShapes.PokemonShape;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PokemonShapeService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	PokemonShape IdOrName(String idOrName);
}
