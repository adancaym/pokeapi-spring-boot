package com.caym.pokeapi.models.pokemon.pokemonShapes;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonShape {

	Integer id;
	String name;
	List<AwesomeName> awesome_names;
	List<Name> names;
	List<NamedAPIResource> pokemon_species;
	
}
