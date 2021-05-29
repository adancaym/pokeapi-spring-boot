package com.caym.pokeapi.models.encounters.encountersConditions;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EncounterCondition {

	Integer id;
	String name;
	List<Name> names;
	List<NamedAPIResource> values;
	
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
	public List<NamedAPIResource> getValues() {
		return values;
	}
	public void setValues(List<NamedAPIResource> values) {
		this.values = values;
	}
	
	
}
