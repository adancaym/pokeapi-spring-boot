package com.caym.pokeapi.service.egg.group.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.eggGroups.EggGroup;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface EggGroupService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	EggGroup IdOrName(String idOrName);
}
