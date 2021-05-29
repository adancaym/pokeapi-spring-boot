package com.caym.pokeapi.models.pokemon.pokemon;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonMove {

	NamedAPIResource move;
	List<PokemonMoveVersion> version_group_details;
	public NamedAPIResource getMove() {
		return move;
	}
	public void setMove(NamedAPIResource move) {
		this.move = move;
	}
	public List<PokemonMoveVersion> getVersion_group_details() {
		return version_group_details;
	}
	public void setVersion_group_details(List<PokemonMoveVersion> version_group_details) {
		this.version_group_details = version_group_details;
	}
}
