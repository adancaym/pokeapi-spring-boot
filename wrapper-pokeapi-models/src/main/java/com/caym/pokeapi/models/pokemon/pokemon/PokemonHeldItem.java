package com.caym.pokeapi.models.pokemon.pokemon;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonHeldItem {

	NamedAPIResource item;
	List<PokemonHeldItemVersion> version_details;
	public NamedAPIResource getItem() {
		return item;
	}
	public void setItem(NamedAPIResource item) {
		this.item = item;
	}
	public List<PokemonHeldItemVersion> getVersion_details() {
		return version_details;
	}
	public void setVersion_details(List<PokemonHeldItemVersion> version_details) {
		this.version_details = version_details;
	}
}
