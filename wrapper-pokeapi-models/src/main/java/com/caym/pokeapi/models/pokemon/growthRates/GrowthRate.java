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
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public List<Description> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	public List<GrowthRateExperienceLevel> getLevels() {
		return levels;
	}
	public void setLevels(List<GrowthRateExperienceLevel> levels) {
		this.levels = levels;
	}
	public List<NamedAPIResource> getPokemon_species() {
		return pokemon_species;
	}
	public void setPokemon_species(List<NamedAPIResource> pokemon_species) {
		this.pokemon_species = pokemon_species;
	}
	
	
}
