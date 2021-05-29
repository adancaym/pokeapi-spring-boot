package com.caym.pokeapi.models.moves.moveAilments;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;

public class MoveBattleStyle {

	Integer id;
	String name;
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
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
	
}
