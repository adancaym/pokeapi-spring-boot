package com.caym.pokeapi.models.items.item;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ItemHolderPokemon {

	NamedAPIResource pokemon;
	ItemHolderPokemonVersionDetail version_details;
	public NamedAPIResource getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}
	public ItemHolderPokemonVersionDetail getVersion_details() {
		return version_details;
	}
	public void setVersion_details(ItemHolderPokemonVersionDetail version_details) {
		this.version_details = version_details;
	}
	
	
}
