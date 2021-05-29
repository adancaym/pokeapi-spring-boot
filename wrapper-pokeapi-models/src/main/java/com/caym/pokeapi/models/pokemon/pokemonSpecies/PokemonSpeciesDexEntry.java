package com.caym.pokeapi.models.pokemon.pokemonSpecies;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonSpeciesDexEntry {

	Integer entry_number;
	NamedAPIResource pokedex;
	public Integer getEntry_number() {
		return entry_number;
	}
	public void setEntry_number(Integer entry_number) {
		this.entry_number = entry_number;
	}
	public NamedAPIResource getPokedex() {
		return pokedex;
	}
	public void setPokedex(NamedAPIResource pokedex) {
		this.pokedex = pokedex;
	}
}
