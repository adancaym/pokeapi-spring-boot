package com.caym.pokeapi.models.pokemon.pokemonShapes;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class AwesomeName {
	String awesome_name;
	NamedAPIResource language;
	public String getAwesome_name() {
		return awesome_name;
	}
	public void setAwesome_name(String awesome_name) {
		this.awesome_name = awesome_name;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

}
