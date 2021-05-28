package com.caym.pokeapi.models.pokemon.genders;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Gender {
	Integer id;
	String name;
	List<PokemonSpeciesGender> pokemon_species_details;
	List<NamedAPIResource> required_for_evolution;
}
