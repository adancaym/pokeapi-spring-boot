package com.caym.pokeapi.models.games.gamesVersionGroups;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class VersionGroup {
	Integer id;
	String name; 
	Integer order;
	NamedAPIResource generation;
	List<NamedAPIResource> move_learn_methods;
	List<NamedAPIResource> pokedexes;
	List<NamedAPIResource> regions;
	List<NamedAPIResource> versions;
}
