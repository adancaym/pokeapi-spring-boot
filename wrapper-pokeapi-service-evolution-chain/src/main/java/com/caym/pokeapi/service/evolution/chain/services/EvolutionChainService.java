package com.caym.pokeapi.service.evolution.chain.services;

import java.util.Map;

import com.caym.pokeapi.models.evolution.evolutionChains.EvolutionChain;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface EvolutionChainService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	EvolutionChain IdOrName(String idOrName);
}
