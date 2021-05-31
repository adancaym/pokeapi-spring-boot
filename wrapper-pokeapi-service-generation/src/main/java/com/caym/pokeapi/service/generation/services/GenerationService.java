package com.caym.pokeapi.service.generation.services;

import java.util.Map;

import com.caym.pokeapi.models.games.gamesGenerations.Generation;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface GenerationService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Generation IdOrName(String idOrName);
}
