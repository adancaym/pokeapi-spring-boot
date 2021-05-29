package com.caym.pokeapi.models.games.gamesPokedexes;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonEntry {

	Integer entry_number;
	NamedAPIResource pokemon_species;
	public Integer getEntry_number() {
		return entry_number;
	}
	public void setEntry_number(Integer entry_number) {
		this.entry_number = entry_number;
	}
	public NamedAPIResource getPokemon_species() {
		return pokemon_species;
	}
	public void setPokemon_species(NamedAPIResource pokemon_species) {
		this.pokemon_species = pokemon_species;
	}
	
	
}
