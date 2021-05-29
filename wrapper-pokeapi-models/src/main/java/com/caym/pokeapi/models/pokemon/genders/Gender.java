package com.caym.pokeapi.models.pokemon.genders;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Gender {
	Integer id;
	String name;
	List<PokemonSpeciesGender> pokemon_species_details;
	List<NamedAPIResource> required_for_evolution;
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
	public List<PokemonSpeciesGender> getPokemon_species_details() {
		return pokemon_species_details;
	}
	public void setPokemon_species_details(List<PokemonSpeciesGender> pokemon_species_details) {
		this.pokemon_species_details = pokemon_species_details;
	}
	public List<NamedAPIResource> getRequired_for_evolution() {
		return required_for_evolution;
	}
	public void setRequired_for_evolution(List<NamedAPIResource> required_for_evolution) {
		this.required_for_evolution = required_for_evolution;
	}
	
	
}
