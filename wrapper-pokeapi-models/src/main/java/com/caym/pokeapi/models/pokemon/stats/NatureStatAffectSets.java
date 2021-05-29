package com.caym.pokeapi.models.pokemon.stats;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class NatureStatAffectSets {

	List<NamedAPIResource> increase;
	List<NamedAPIResource> decrease;
	public List<NamedAPIResource> getIncrease() {
		return increase;
	}
	public void setIncrease(List<NamedAPIResource> increase) {
		this.increase = increase;
	}
	public List<NamedAPIResource> getDecrease() {
		return decrease;
	}
	public void setDecrease(List<NamedAPIResource> decrease) {
		this.decrease = decrease;
	}
}
