package com.caym.pokeapi.service.location.services;

import java.util.Map;

import com.caym.pokeapi.models.locations.locations.Location;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface LocationService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Location IdOrName(String idOrName);
}
