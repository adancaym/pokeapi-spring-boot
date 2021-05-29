package com.caym.pokeapi.service.contest.type.service;

import java.util.Map;

import com.caym.pokeapi.models.contest.contestTypes.ContestType;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface ContestTypeService {
	
	NamedAPIResourceList Index(Map<String,String> qparams);
	ContestType IdOrName(String idOrName);	
}
