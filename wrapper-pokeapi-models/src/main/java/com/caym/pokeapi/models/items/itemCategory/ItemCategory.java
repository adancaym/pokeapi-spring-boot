package com.caym.pokeapi.models.items.itemCategory;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ItemCategory {
	Integer id;
	String name; 
	List<NamedAPIResource> items;
	List<Name> names;
	NamedAPIResource pocket;
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
	public List<NamedAPIResource> getItems() {
		return items;
	}
	public void setItems(List<NamedAPIResource> items) {
		this.items = items;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public NamedAPIResource getPocket() {
		return pocket;
	}
	public void setPocket(NamedAPIResource pocket) {
		this.pocket = pocket;
	}
	
}
