package com.caym.pokeapi.models.evolution.evolutionChains;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EvolutionChain {

	Integer id;
	NamedAPIResource baby_trigger_item;
	ChainLink chain;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public NamedAPIResource getBaby_trigger_item() {
		return baby_trigger_item;
	}
	public void setBaby_trigger_item(NamedAPIResource baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
	}
	public ChainLink getChain() {
		return chain;
	}
	public void setChain(ChainLink chain) {
		this.chain = chain;
	}
	
	
}
