package com.caym.pokeapi.models.pokemon.pokeathlonStats;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class NaturePokeathlonStatAffect {

	Integer max_change;
	NamedAPIResource nature;
	public Integer getMax_change() {
		return max_change;
	}
	public void setMax_change(Integer max_change) {
		this.max_change = max_change;
	}
	public NamedAPIResource getNature() {
		return nature;
	}
	public void setNature(NamedAPIResource nature) {
		this.nature = nature;
	}
}
