package com.caym.pokeapi.models.locations.locationAreas;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VersionEncounterDetail;

public class PokemonEncounter {

	NamedAPIResource pokemon;
	List<VersionEncounterDetail> version_details;
	public NamedAPIResource getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}
	public List<VersionEncounterDetail> getVersion_details() {
		return version_details;
	}
	public void setVersion_details(List<VersionEncounterDetail> version_details) {
		this.version_details = version_details;
	}
	
}
