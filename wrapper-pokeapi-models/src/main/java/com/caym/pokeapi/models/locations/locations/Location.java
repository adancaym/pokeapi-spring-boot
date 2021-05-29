package com.caym.pokeapi.models.locations.locations;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.GenerationGameIndex;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Location {

	Integer id;
	String name;
	NamedAPIResource region;
	List<Name> names;
	List<GenerationGameIndex> game_indices;
	List<NamedAPIResource> areas;
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
	public NamedAPIResource getRegion() {
		return region;
	}
	public void setRegion(NamedAPIResource region) {
		this.region = region;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<GenerationGameIndex> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(List<GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
	}
	public List<NamedAPIResource> getAreas() {
		return areas;
	}
	public void setAreas(List<NamedAPIResource> areas) {
		this.areas = areas;
	}
	
	
}
