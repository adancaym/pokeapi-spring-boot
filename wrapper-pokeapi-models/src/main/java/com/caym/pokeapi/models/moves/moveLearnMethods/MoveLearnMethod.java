package com.caym.pokeapi.models.moves.moveLearnMethods;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveLearnMethod {
	Integer id;
	String name;
	List<NamedAPIResource> moves;
	List<NamedAPIResource> version_groups;
	List<Description> descriptions;
	List<Name> names;
	
}
