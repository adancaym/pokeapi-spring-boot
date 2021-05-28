package com.caym.pokeapi.models.pokemon.types;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.GenerationGameIndex;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Type {
	
	Integer id;
	String name;
	TypeRelations damage_relations;
	List<GenerationGameIndex> game_indices;
	NamedAPIResource generation;
	NamedAPIResource move_damage_class;
	List<Name> names;
	List<TypePokemon> pokemon;
	NamedAPIResource moves;
	
}
