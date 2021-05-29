package com.caym.pokeapi.models.pokemon.natures;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class NatureStatChange {

	Integer max_change;
	NamedAPIResource pokeathlon_stat;
	public Integer getMax_change() {
		return max_change;
	}
	public void setMax_change(Integer max_change) {
		this.max_change = max_change;
	}
	public NamedAPIResource getPokeathlon_stat() {
		return pokeathlon_stat;
	}
	public void setPokeathlon_stat(NamedAPIResource pokeathlon_stat) {
		this.pokeathlon_stat = pokeathlon_stat;
	}
	
	
}
