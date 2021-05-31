package com.caym.pokeapi.service.encounter.condition.value.services;

import java.util.Map;

import com.caym.pokeapi.models.encounters.encountersConditionValues.EncounterConditionValue;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface EncounterConditionValueService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	EncounterConditionValue IdOrName(String idOrName);
}
