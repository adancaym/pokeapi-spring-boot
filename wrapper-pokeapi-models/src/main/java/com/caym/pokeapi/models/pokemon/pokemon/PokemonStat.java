package com.caym.pokeapi.models.pokemon.pokemon;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonStat {
	NamedAPIResource stat;
	Integer effort;
	Integer base_stat;
	public NamedAPIResource getStat() {
		return stat;
	}
	public void setStat(NamedAPIResource stat) {
		this.stat = stat;
	}
	public Integer getEffort() {
		return effort;
	}
	public void setEffort(Integer effort) {
		this.effort = effort;
	}
	public Integer getBase_stat() {
		return base_stat;
	}
	public void setBase_stat(Integer base_stat) {
		this.base_stat = base_stat;
	}
}
