package com.caym.pokeapi.models.pokemon.pokemonSpecies;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonSpeciesVariety {

	Boolean is_default;
	NamedAPIResource pokemon;
	public Boolean getIs_default() {
		return is_default;
	}
	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}
	public NamedAPIResource getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}
}
