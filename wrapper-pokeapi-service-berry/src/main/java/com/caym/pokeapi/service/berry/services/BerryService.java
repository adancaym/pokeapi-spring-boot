package com.caym.pokeapi.service.berry.services;

import java.util.Map;

import com.caym.pokeapi.models.berries.berries.Berry;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface BerryService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Berry IdOrName(String idOrName);
}
