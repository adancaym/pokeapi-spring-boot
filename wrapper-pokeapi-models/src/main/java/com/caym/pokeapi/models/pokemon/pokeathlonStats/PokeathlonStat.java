package com.caym.pokeapi.models.pokemon.pokeathlonStats;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;

public class PokeathlonStat {

	Integer id;
	String name;
	List<Name> names;
	NaturePokeathlonStatAffectSets affecting_natures;
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
	public NaturePokeathlonStatAffectSets getAffecting_natures() {
		return affecting_natures;
	}
	public void setAffecting_natures(NaturePokeathlonStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
	} 
	
}
