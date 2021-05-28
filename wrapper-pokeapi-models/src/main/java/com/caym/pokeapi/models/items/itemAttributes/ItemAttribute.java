package com.caym.pokeapi.models.items.itemAttributes;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ItemAttribute {
	Integer id;
	String name; 
	List<NamedAPIResource> items;
	List<Name> names;
	List<Description> descriptions;
}
