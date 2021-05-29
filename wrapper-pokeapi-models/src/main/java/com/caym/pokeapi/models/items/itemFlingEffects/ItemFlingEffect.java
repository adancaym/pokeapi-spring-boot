package com.caym.pokeapi.models.items.itemFlingEffects;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Effect;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ItemFlingEffect {
	Integer id;
	String name; 
	List<Effect> effect_entries;
	List<NamedAPIResource> items;
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
	public List<Effect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<Effect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public List<NamedAPIResource> getItems() {
		return items;
	}
	public void setItems(List<NamedAPIResource> items) {
		this.items = items;
	}
	
	
}
