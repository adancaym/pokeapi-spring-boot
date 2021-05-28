package com.caym.pokeapi.models.pokemon.pokemon;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonMove {

	NamedAPIResource move;
	List<PokemonMoveVersion> version_group_details;
}
