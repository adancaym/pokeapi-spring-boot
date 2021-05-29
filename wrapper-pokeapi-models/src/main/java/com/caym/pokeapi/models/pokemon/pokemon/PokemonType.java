package com.caym.pokeapi.models.pokemon.pokemon;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonType {

	Integer slot;
	NamedAPIResource type;
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public NamedAPIResource getType() {
		return type;
	}
	public void setType(NamedAPIResource type) {
		this.type = type;
	}
}
