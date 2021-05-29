package com.caym.pokeapi.models.evolution.evolutionTriggers;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EvolutionTrigger {

	Integer id;
	String name;
	List<Name> names;
	List<NamedAPIResource> turn_upside_down;
	
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
	public List<NamedAPIResource> getTurn_upside_down() {
		return turn_upside_down;
	}
	public void setTurn_upside_down(List<NamedAPIResource> turn_upside_down) {
		this.turn_upside_down = turn_upside_down;
	}
	
	
	
}
