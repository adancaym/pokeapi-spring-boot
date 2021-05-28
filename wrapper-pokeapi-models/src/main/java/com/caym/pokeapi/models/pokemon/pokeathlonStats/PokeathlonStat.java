package com.caym.pokeapi.models.pokemon.pokeathlonStats;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;

public class PokeathlonStat {

	Integer id;
	String name;
	List<Name> names;
	NaturePokeathlonStatAffectSets affecting_natures; 
	
}
