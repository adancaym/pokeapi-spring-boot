package com.caym.pokeapi.service.growth.rate.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.growthRates.GrowthRate;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface GrowthRateService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	GrowthRate IdOrName(String idOrName);
}
