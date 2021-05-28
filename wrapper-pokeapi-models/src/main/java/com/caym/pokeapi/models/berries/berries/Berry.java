package com.caym.pokeapi.models.berries.berries;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Berry {

	Integer id;
	String name;
	Integer growth_time;
	Integer max_harvest;
	Integer natural_gift_power;
	Integer size;
	Integer smoothness;
	Integer soil_dryness;
	NamedAPIResource firmness;
	List<BerryFlavorMap> flavors;
	NamedAPIResource item;
	NamedAPIResource natural_gift_type;
	
}
