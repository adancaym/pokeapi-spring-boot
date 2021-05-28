package com.caym.pokeapi.models.moves.moveTargets;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveTarget {
	Integer id;
	String name;
	List<NamedAPIResource> moves;
	List<Description> descriptions;
	List<Name> names;
}
