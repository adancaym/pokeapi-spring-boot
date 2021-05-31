package com.caym.pokeapi.service.nature.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.natures.Nature;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface NatureService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Nature IdOrName(String idOrName);
}
