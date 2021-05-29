package com.caym.pokeapi.models.pokemon.pokemonSpecies;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Genus {

	String genus;
	NamedAPIResource language;
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}
