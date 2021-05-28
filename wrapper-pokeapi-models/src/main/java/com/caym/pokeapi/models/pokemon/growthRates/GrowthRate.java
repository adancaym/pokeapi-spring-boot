package com.caym.pokeapi.models.pokemon.growthRates;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class GrowthRate {
	Integer id;
	String name;
	String formula;
	List<Description> descriptions;
	List<GrowthRateExperienceLevel> levels;
	List<NamedAPIResource> pokemon_species;
}
