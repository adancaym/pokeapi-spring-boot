package com.caym.pokeapi.models.items.itemPocket;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ItemPocket {
	Integer id;
	String name; 
	List<NamedAPIResource> categories;
	List<Name> names;
}
