package com.caym.pokeapi.models.pokemon.pokemon;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonAbility {

	Boolean is_hidden;
	Integer slot;
	NamedAPIResource ability;
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
	public NamedAPIResource getAbility() {
		return ability;
	}
	public void setAbility(NamedAPIResource ability) {
		this.ability = ability;
	}
}
