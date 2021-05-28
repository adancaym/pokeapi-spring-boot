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
}
