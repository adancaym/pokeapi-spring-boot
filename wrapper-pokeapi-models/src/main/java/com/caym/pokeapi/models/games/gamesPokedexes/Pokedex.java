package com.caym.pokeapi.models.games.gamesPokedexes;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Pokedex {

	Integer id;
	String name;
	Boolean is_main_series;
	List<Description> descriptions;
	List<Name> names;
	List<PokemonEntry> pokemon_entries;
	NamedAPIResource region;
	List<NamedAPIResource> version_groups;
}
