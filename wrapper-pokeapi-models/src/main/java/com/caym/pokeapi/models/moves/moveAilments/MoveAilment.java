package com.caym.pokeapi.models.moves.moveAilments;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveAilment {

	Integer id;
	String name;
	List<NamedAPIResource> moves;
	List<Name> names;
}
