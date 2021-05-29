package com.caym.pokeapi.models.items.item;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ItemHolderPokemonVersionDetail {
	Integer rarity;
	NamedAPIResource version;
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	public NamedAPIResource getVersion() {
		return version;
	}
	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}
	

}
