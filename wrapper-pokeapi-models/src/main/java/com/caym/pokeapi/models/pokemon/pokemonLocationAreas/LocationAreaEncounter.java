package com.caym.pokeapi.models.pokemon.pokemonLocationAreas;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VersionEncounterDetail;

public class LocationAreaEncounter {

	NamedAPIResource location_area;
	List<VersionEncounterDetail> version_details;
	public NamedAPIResource getLocation_area() {
		return location_area;
	}
	public void setLocation_area(NamedAPIResource location_area) {
		this.location_area = location_area;
	}
	public List<VersionEncounterDetail> getVersion_details() {
		return version_details;
	}
	public void setVersion_details(List<VersionEncounterDetail> version_details) {
		this.version_details = version_details;
	}
}
