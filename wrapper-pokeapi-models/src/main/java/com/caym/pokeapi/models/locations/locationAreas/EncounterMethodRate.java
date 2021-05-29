package com.caym.pokeapi.models.locations.locationAreas;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EncounterMethodRate {

	NamedAPIResource encounter_method;
	List<EncounterVersionDetails> version_details;
	public NamedAPIResource getEncounter_method() {
		return encounter_method;
	}
	public void setEncounter_method(NamedAPIResource encounter_method) {
		this.encounter_method = encounter_method;
	}
	public List<EncounterVersionDetails> getVersion_details() {
		return version_details;
	}
	public void setVersion_details(List<EncounterVersionDetails> version_details) {
		this.version_details = version_details;
	}
	
	
}
