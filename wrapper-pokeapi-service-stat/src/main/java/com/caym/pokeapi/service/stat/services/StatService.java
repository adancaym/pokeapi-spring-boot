package com.caym.pokeapi.service.stat.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.stats.Stat;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface StatService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Stat IdOrName(String idOrName);
}
