package com.caym.pokeapi.service.type.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.types.Type;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface TypeService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Type IdOrName(String idOrName);
}
