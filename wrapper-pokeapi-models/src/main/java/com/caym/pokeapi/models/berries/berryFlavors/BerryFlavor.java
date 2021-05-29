package com.caym.pokeapi.models.berries.berryFlavors;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class BerryFlavor {
	Integer id;
	String name;
	List<FlavorBerryMap> berries;
	NamedAPIResource contest_type;
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
	public List<FlavorBerryMap> getBerries() {
		return berries;
	}
	public void setBerries(List<FlavorBerryMap> berries) {
		this.berries = berries;
	}
	public NamedAPIResource getContest_type() {
		return contest_type;
	}
	public void setContest_type(NamedAPIResource contest_type) {
		this.contest_type = contest_type;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
	
}
