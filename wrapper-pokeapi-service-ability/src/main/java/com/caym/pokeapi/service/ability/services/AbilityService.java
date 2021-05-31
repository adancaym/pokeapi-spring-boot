package com.caym.pokeapi.service.ability.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.abilities.Ability;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface AbilityService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Ability IdOrName(String idOrName);
}
