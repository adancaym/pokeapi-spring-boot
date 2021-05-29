package com.caym.pokeapi.models.moves.moves;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveStatChange {

	Integer change;
	NamedAPIResource stat;
	public Integer getChange() {
		return change;
	}
	public void setChange(Integer change) {
		this.change = change;
	}
	public NamedAPIResource getStat() {
		return stat;
	}
	public void setStat(NamedAPIResource stat) {
		this.stat = stat;
	}
	
	
}
