package com.caym.pokeapi.service.pokedex.services;

import java.util.Map;

import com.caym.pokeapi.models.games.gamesPokedexes.Pokedex;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PokedexService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Pokedex IdOrName(String idOrName);
}
