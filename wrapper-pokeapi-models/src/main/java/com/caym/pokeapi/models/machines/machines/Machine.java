package com.caym.pokeapi.models.machines.machines;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Machine {

	Integer id;
	NamedAPIResource item;
	NamedAPIResource move;
	NamedAPIResource version_group;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public NamedAPIResource getItem() {
		return item;
	}
	public void setItem(NamedAPIResource item) {
		this.item = item;
	}
	public NamedAPIResource getMove() {
		return move;
	}
	public void setMove(NamedAPIResource move) {
		this.move = move;
	}
	public NamedAPIResource getVersion_group() {
		return version_group;
	}
	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}
	
	
;
}
