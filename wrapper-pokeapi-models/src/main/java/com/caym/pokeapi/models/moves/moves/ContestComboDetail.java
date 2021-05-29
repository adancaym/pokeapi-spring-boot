package com.caym.pokeapi.models.moves.moves;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ContestComboDetail {

	List<NamedAPIResource> use_before;
	List<NamedAPIResource> use_after;
	public List<NamedAPIResource> getUse_before() {
		return use_before;
	}
	public void setUse_before(List<NamedAPIResource> use_before) {
		this.use_before = use_before;
	}
	public List<NamedAPIResource> getUse_after() {
		return use_after;
	}
	public void setUse_after(List<NamedAPIResource> use_after) {
		this.use_after = use_after;
	}
	
	
}
