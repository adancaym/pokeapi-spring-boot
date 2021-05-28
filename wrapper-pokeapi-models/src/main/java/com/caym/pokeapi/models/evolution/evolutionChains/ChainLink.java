package com.caym.pokeapi.models.evolution.evolutionChains;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ChainLink {

	Boolean is_baby;
	NamedAPIResource species;
	List<EvolutionDetail> evolution_details;
	List<ChainLink> evolves_to;
}
