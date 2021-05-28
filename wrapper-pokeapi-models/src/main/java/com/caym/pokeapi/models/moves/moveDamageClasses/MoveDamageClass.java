package com.caym.pokeapi.models.moves.moveDamageClasses;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveDamageClass {
	Integer id;
	String name;
	List<NamedAPIResource> moves;
	List<Description> descriptions;
	List<Name> names;
}
