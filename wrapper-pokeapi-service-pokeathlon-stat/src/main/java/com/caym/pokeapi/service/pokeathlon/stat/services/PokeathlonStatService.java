package com.caym.pokeapi.service.pokeathlon.stat.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.pokeathlonStats.PokeathlonStat;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PokeathlonStatService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	PokeathlonStat IdOrName(String idOrName);
}
