package com.caym.pokeapi.models.encounters.encountersConditionValues;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EncounterConditionValue {

	Integer id;
	String name;
	NamedAPIResource condition;
	List<Name> names;
}
