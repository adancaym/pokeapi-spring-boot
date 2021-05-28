package com.caym.pokeapi.models.utility.commonModels;

import java.util.List;

public class Encounter {

	Integer min_level;
	Integer max_level ;
	List<NamedAPIResource> condition_values;
	Integer chance;
	NamedAPIResource method;
}
