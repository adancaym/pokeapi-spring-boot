package com.caym.pokeapi.models.pokemon.pokemon;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VersionGameIndex;

public class Pokemon {
	Integer id;
	String name;
	Integer base_experience;
	Integer height;
	Boolean is_default;
	Integer order;
	Integer weight;
	List<PokemonAbility> abilities;
	List<NamedAPIResource> forms;
	List<VersionGameIndex> game_indices;
	List<PokemonHeldItem> held_items;
	String location_area_encounters;
	List<PokemonMove> moves;
	PokemonSprites sprites;
	NamedAPIResource species;
	List<PokemonStat> stats;
	List<PokemonType> types;
}
