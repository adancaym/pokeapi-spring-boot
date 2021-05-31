package com.caym.pokeapi.service.location.area.services;

import java.util.Map;

import com.caym.pokeapi.models.locations.locationAreas.LocationArea;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface LocationAreaService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	LocationArea IdOrName(String idOrName);
}
