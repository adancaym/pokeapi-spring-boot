package com.caym.pokeapi.models.berries.berryFirmnesses;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class BerryFirmness {
	Integer id;
	String name;
	List<NamedAPIResource> berries;
	List<Name> names;
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
	public List<NamedAPIResource> getBerries() {
		return berries;
	}
	public void setBerries(List<NamedAPIResource> berries) {
		this.berries = berries;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
