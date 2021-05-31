package com.caym.pokeapi.service.pal.park.area.services;

import java.util.Map;

import com.caym.pokeapi.models.locations.palParkAreas.PalParkArea;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PalParkAreaService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	PalParkArea IdOrName(String idOrName);
}
