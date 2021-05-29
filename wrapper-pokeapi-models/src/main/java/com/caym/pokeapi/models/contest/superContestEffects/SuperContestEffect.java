package com.caym.pokeapi.models.contest.superContestEffects;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.FlavorText;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class SuperContestEffect {

	Integer id;
	Integer appeal;
	FlavorText flavor_text_entries;
	List<NamedAPIResource> moves;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAppeal() {
		return appeal;
	}
	public void setAppeal(Integer appeal) {
		this.appeal = appeal;
	}
	public FlavorText getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(FlavorText flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public List<NamedAPIResource> getMoves() {
		return moves;
	}
	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}
	
	
}
