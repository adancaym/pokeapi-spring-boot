package com.caym.pokeapi.models.pokemon.pokemonSpecies;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PalParkEncounterArea {

	Integer base_score;
	Integer rate;
	NamedAPIResource area;
	public Integer getBase_score() {
		return base_score;
	}
	public void setBase_score(Integer base_score) {
		this.base_score = base_score;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public NamedAPIResource getArea() {
		return area;
	}
	public void setArea(NamedAPIResource area) {
		this.area = area;
	}
}
