package com.caym.pokeapi.models.pokemon.pokemon;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonHeldItemVersion {

	NamedAPIResource version;
	Integer rarity;
	public NamedAPIResource getVersion() {
		return version;
	}
	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
}
