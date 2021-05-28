package com.caym.pokeapi.models.moves.moveCategories;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveCategory {
	Integer id;
	String name;
	List<NamedAPIResource> moves;
	List<Description> descriptions;
	
}
