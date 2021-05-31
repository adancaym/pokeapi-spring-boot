package com.caym.pokeapi.service.region.services;

import java.util.Map;

import com.caym.pokeapi.models.locations.regions.Region;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface RegionService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Region IdOrName(String idOrName);
}
