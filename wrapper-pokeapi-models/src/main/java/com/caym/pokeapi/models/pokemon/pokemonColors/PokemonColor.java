package com.caym.pokeapi.models.pokemon.pokemonColors;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonColor {

	Integer id;
	String name;
	List<Name> names;
	List<NamedAPIResource> pokemon_species;
}
