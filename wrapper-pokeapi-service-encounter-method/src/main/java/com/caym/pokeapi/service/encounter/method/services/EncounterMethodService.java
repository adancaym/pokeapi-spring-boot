package com.caym.pokeapi.service.encounter.method.services;

import java.util.Map;

import com.caym.pokeapi.models.encounters.encountersMethods.EncounterMethod;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface EncounterMethodService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	EncounterMethod IdOrName(String idOrName);
}
