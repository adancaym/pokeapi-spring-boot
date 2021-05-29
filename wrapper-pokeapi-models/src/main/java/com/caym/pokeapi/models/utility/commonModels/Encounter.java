package com.caym.pokeapi.models.utility.commonModels;

import java.util.List;

public class Encounter {

	Integer min_level;
	Integer max_level ;
	List<NamedAPIResource> condition_values;
	Integer chance;
	NamedAPIResource method;
	public Integer getMin_level() {
		return min_level;
	}
	public void setMin_level(Integer min_level) {
		this.min_level = min_level;
	}
	public Integer getMax_level() {
		return max_level;
	}
	public void setMax_level(Integer max_level) {
		this.max_level = max_level;
	}
	public List<NamedAPIResource> getCondition_values() {
		return condition_values;
	}
	public void setCondition_values(List<NamedAPIResource> condition_values) {
		this.condition_values = condition_values;
	}
	public Integer getChance() {
		return chance;
	}
	public void setChance(Integer chance) {
		this.chance = chance;
	}
	public NamedAPIResource getMethod() {
		return method;
	}
	public void setMethod(NamedAPIResource method) {
		this.method = method;
	}
}
