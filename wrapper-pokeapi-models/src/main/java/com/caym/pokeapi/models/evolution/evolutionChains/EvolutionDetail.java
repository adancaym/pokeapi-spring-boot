package com.caym.pokeapi.models.evolution.evolutionChains;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EvolutionDetail {

	NamedAPIResource item;
	NamedAPIResource trigger;
	Integer gender;
	NamedAPIResource held_item;
	NamedAPIResource known_move;
	NamedAPIResource known_move_type;
	NamedAPIResource location;
	Integer min_level;
	Integer min_happiness;
	Integer min_beauty;
	Integer min_affection;
	Boolean needs_overworld_rain;
	NamedAPIResource party_species;
	NamedAPIResource party_type;
	Integer relative_physical_stats;
	String time_of_day;
	NamedAPIResource trade_species;
	Boolean turn_upside_down;
}
