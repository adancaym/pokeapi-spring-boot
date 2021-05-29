package com.caym.pokeapi.service.named.services;

import java.util.Map;

import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface NamedService {
	
	public NamedAPIResourceList named(String endpoint, Map<String,String> qparams);

}
