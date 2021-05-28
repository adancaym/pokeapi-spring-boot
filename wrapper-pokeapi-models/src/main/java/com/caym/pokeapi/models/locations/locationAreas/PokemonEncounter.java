package com.caym.pokeapi.models.locations.locationAreas;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VersionEncounterDetail;

public class PokemonEncounter {

	NamedAPIResource pokemon;
	List<VersionEncounterDetail> version_details;
}
