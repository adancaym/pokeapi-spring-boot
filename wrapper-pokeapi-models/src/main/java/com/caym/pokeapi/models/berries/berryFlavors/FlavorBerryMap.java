package com.caym.pokeapi.models.berries.berryFlavors;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class FlavorBerryMap {
	Integer potency;
	NamedAPIResource berry;
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public NamedAPIResource getBerry() {
		return berry;
	}
	public void setBerry(NamedAPIResource berry) {
		this.berry = berry;
	}
	
}
