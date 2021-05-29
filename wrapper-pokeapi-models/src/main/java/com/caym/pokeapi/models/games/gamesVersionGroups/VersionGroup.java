package com.caym.pokeapi.models.games.gamesVersionGroups;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class VersionGroup {
	Integer id;
	String name; 
	Integer order;
	NamedAPIResource generation;
	List<NamedAPIResource> move_learn_methods;
	List<NamedAPIResource> pokedexes;
	List<NamedAPIResource> regions;
	List<NamedAPIResource> versions;
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
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}
	public List<NamedAPIResource> getMove_learn_methods() {
		return move_learn_methods;
	}
	public void setMove_learn_methods(List<NamedAPIResource> move_learn_methods) {
		this.move_learn_methods = move_learn_methods;
	}
	public List<NamedAPIResource> getPokedexes() {
		return pokedexes;
	}
	public void setPokedexes(List<NamedAPIResource> pokedexes) {
		this.pokedexes = pokedexes;
	}
	public List<NamedAPIResource> getRegions() {
		return regions;
	}
	public void setRegions(List<NamedAPIResource> regions) {
		this.regions = regions;
	}
	public List<NamedAPIResource> getVersions() {
		return versions;
	}
	public void setVersions(List<NamedAPIResource> versions) {
		this.versions = versions;
	}
	
	
}
