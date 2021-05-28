package com.caym.pokeapi.models.pokemon.stats;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.APIResource;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Stat {

	Integer id;
	String name;
	Integer game_index;
	Boolean is_battle_only;
	MoveStatAffectSets affecting_moves;
	NatureStatAffectSets affecting_natures;
	List<APIResource> characteristics;
	NamedAPIResource move_damage_class;
	List<Name> names;
}
