package com.caym.pokeapi.models.contest.contestTypes;

import java.util.List;

import com.caym.pokeapi.models.contest.contestEffects.ContestName;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ContestType {

	Integer id;
	String name;
	NamedAPIResource berry_flavor;
	List<ContestName> names;
	
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
	public NamedAPIResource getBerry_flavor() {
		return berry_flavor;
	}
	public void setBerry_flavor(NamedAPIResource berry_flavor) {
		this.berry_flavor = berry_flavor;
	}
	public List<ContestName> getNames() {
		return names;
	}
	public void setNames(List<ContestName> names) {
		this.names = names;
	}
	
}
