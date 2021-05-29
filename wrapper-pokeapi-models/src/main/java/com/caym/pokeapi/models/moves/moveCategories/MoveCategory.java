package com.caym.pokeapi.models.moves.moveCategories;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveCategory {
	Integer id;
	String name;
	List<NamedAPIResource> moves;
	List<Description> descriptions;
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
	public List<NamedAPIResource> getMoves() {
		return moves;
	}
	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}
	public List<Description> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	
	
}
