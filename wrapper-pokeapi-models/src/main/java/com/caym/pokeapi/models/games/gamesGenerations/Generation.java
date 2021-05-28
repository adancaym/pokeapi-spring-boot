package com.caym.pokeapi.models.games.gamesGenerations;

import java.util.List;

import com.caym.pokeapi.models.pokemon.types.Type;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Generation {

	Integer id;
	String name;
	List<NamedAPIResource> abilities;
	List<Name> names;
	NamedAPIResource main_region;
	List<NamedAPIResource> moves;
	List<NamedAPIResource> pokemon_species;
	List<Type> types;
	List<NamedAPIResource> version_groups;
}
