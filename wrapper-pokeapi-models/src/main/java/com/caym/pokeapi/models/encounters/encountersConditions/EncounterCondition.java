package com.caym.pokeapi.models.encounters.encountersConditions;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EncounterCondition {

	Integer id;
	String name;
	List<Name> names;
	List<NamedAPIResource> values;
}
