package com.caym.pokeapi.models.evolution.evolutionChains;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ChainLink {

	Boolean is_baby;
	NamedAPIResource species;
	List<EvolutionDetail> evolution_details;
	List<ChainLink> evolves_to;
	
	public Boolean getIs_baby() {
		return is_baby;
	}
	public void setIs_baby(Boolean is_baby) {
		this.is_baby = is_baby;
	}
	public NamedAPIResource getSpecies() {
		return species;
	}
	public void setSpecies(NamedAPIResource species) {
		this.species = species;
	}
	public List<EvolutionDetail> getEvolution_details() {
		return evolution_details;
	}
	public void setEvolution_details(List<EvolutionDetail> evolution_details) {
		this.evolution_details = evolution_details;
	}
	public List<ChainLink> getEvolves_to() {
		return evolves_to;
	}
	public void setEvolves_to(List<ChainLink> evolves_to) {
		this.evolves_to = evolves_to;
	}
	
	
}
