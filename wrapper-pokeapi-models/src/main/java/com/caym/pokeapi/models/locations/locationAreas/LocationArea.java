package com.caym.pokeapi.models.locations.locationAreas;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class LocationArea {
	Integer id;
	String name;
	List<Name> names;

	Integer game_index;
	EncounterMethodRate encounter_method_rates;
	NamedAPIResource location;
	List<PokemonEncounter> pokemon_encounters;
}
