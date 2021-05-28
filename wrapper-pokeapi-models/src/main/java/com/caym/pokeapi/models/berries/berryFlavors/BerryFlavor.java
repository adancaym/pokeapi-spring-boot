package com.caym.pokeapi.models.berries.berryFlavors;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class BerryFlavor {
	Integer id;
	String name;
	List<FlavorBerryMap> berries;
	NamedAPIResource contest_type;
	List<Name> names;
}
