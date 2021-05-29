package com.caym.pokeapi.models.locations.palParkAreas;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;

public class PalParkArea {
	Integer id;
	String name;
	List<Name> names;
	List<PalParkEncounterSpecies> pokemon_encounters;
	
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
	public List<PalParkEncounterSpecies> getPokemon_encounters() {
		return pokemon_encounters;
	}
	public void setPokemon_encounters(List<PalParkEncounterSpecies> pokemon_encounters) {
		this.pokemon_encounters = pokemon_encounters;
	}
	
	
}
