package com.caym.pokeapi.service.evolution.trigger.services;

import java.util.Map;

import com.caym.pokeapi.models.evolution.evolutionTriggers.EvolutionTrigger;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface EvolutionTriggerService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	EvolutionTrigger IdOrName(String idOrName);
}
