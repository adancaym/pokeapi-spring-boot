package com.caym.pokeapi.models.locations.palParkAreas;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PalParkEncounterSpecies {

	Integer base_score;
	Integer rate;
	NamedAPIResource pokemon_species;
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
	public NamedAPIResource getPokemon_species() {
		return pokemon_species;
	}
	public void setPokemon_species(NamedAPIResource pokemon_species) {
		this.pokemon_species = pokemon_species;
	}
	
	
}
