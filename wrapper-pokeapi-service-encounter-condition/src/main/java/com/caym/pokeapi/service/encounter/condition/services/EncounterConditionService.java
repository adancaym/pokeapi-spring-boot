package com.caym.pokeapi.service.encounter.condition.services;

import java.util.Map;

import com.caym.pokeapi.models.encounters.encountersConditions.EncounterCondition;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface EncounterConditionService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	EncounterCondition IdOrName(String idOrName);
}
