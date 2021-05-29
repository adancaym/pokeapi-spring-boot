package com.caym.pokeapi.models.pokemon.types;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class TypePokemon {

	Integer slot;
	NamedAPIResource pokemon;
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public NamedAPIResource getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}
}
