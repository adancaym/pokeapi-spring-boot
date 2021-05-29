package com.caym.pokeapi.models.pokemon.abilities;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class AbilityPokemon {

	Boolean is_hidden;
	Integer slot;
	NamedAPIResource pokemon;
	public Boolean getIs_hidden() {
		return is_hidden;
	}
	public void setIs_hidden(Boolean is_hidden) {
		this.is_hidden = is_hidden;
	}
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
