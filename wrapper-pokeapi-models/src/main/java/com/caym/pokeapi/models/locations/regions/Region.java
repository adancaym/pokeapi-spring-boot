package com.caym.pokeapi.models.locations.regions;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Region {

	Integer id;
	List<NamedAPIResource> locations;
	String name;
	List<Name> names;
	NamedAPIResource main_generation;
	List<NamedAPIResource> pokedexes;
	List<NamedAPIResource> version_groups;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<NamedAPIResource> getLocations() {
		return locations;
	}
	public void setLocations(List<NamedAPIResource> locations) {
		this.locations = locations;
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
	public NamedAPIResource getMain_generation() {
		return main_generation;
	}
	public void setMain_generation(NamedAPIResource main_generation) {
		this.main_generation = main_generation;
	}
	public List<NamedAPIResource> getPokedexes() {
		return pokedexes;
	}
	public void setPokedexes(List<NamedAPIResource> pokedexes) {
		this.pokedexes = pokedexes;
	}
	public List<NamedAPIResource> getVersion_groups() {
		return version_groups;
	}
	public void setVersion_groups(List<NamedAPIResource> version_groups) {
		this.version_groups = version_groups;
	}
	
	
}
