package com.caym.pokeapi.models.pokemon.genders;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonSpeciesGender {
	Integer rate;
	NamedAPIResource pokemon_species;
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
