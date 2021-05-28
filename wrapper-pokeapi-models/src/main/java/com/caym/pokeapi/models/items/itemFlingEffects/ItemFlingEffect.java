package com.caym.pokeapi.models.items.itemFlingEffects;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Effect;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ItemFlingEffect {
	Integer id;
	String name; 
	List<Effect> effect_entries;
	List<NamedAPIResource> items;
}
