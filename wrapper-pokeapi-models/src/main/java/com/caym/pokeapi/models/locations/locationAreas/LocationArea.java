package com.caym.pokeapi.models.locations.locationAreas;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class LocationArea {
	Integer id;
	String name;
	List<Name> names;

	Integer game_index;
	EncounterMethodRate encounter_method_rates;
	NamedAPIResource location;
	List<PokemonEncounter> pokemon_encounters;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public Integer getGame_index() {
		return game_index;
	}
	public void setGame_index(Integer game_index) {
		this.game_index = game_index;
	}
	public EncounterMethodRate getEncounter_method_rates() {
		return encounter_method_rates;
	}
	public void setEncounter_method_rates(EncounterMethodRate encounter_method_rates) {
		this.encounter_method_rates = encounter_method_rates;
	}
	public NamedAPIResource getLocation() {
		return location;
	}
	public void setLocation(NamedAPIResource location) {
		this.location = location;
	}
	public List<PokemonEncounter> getPokemon_encounters() {
		return pokemon_encounters;
	}
	public void setPokemon_encounters(List<PokemonEncounter> pokemon_encounters) {
		this.pokemon_encounters = pokemon_encounters;
	}
	
	
}
