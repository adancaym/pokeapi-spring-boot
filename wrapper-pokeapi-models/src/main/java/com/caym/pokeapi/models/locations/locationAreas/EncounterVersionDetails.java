package com.caym.pokeapi.models.locations.locationAreas;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EncounterVersionDetails {

	Integer rate;
	NamedAPIResource version;
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public NamedAPIResource getVersion() {
		return version;
	}
	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}
	
	
}
