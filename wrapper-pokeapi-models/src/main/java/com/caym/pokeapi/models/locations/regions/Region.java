package com.caym.pokeapi.models.locations.regions;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Region {

	Integer id;
	List<NamedAPIResource> locations;
	String name;
	List<Name> names;
	NamedAPIResource main_generation;
	List<NamedAPIResource> pokedexes;
	List<NamedAPIResource> version_groups;
}
