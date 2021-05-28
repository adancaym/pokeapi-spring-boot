package com.caym.pokeapi.models.pokemon.pokemonSpecies;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.APIResource;
import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.FlavorText;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonSpecies {

	Integer id;
	String name;
	Integer order;
	Integer gender_rate;
	Integer capture_rate;
	Integer base_happiness;
	Boolean is_baby;
	Boolean is_legendary;
	Boolean is_mythical;
	Integer hatch_counter;
	Boolean has_gender_differences;
	Boolean forms_switchable;
	NamedAPIResource growth_rate;
	List<PokemonSpeciesDexEntry> pokedex_numbers;
	List<NamedAPIResource> egg_groups;
	NamedAPIResource color;
	NamedAPIResource shape;
	NamedAPIResource evolves_from_species;
	APIResource evolution_chain;
	NamedAPIResource habitat;
	NamedAPIResource generation;
	List<Name> names;
	List<PalParkEncounterArea> pal_park_encounters;
	List<FlavorText> flavor_text_entries;
	List<Description> form_descriptions;
	List<Genus> genera;
	List<PokemonSpeciesVariety> varieties;
	
}
