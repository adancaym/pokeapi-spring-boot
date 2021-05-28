package com.caym.pokeapi.models.berries.berryFirmnesses;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class BerryFirmness {
	Integer id;
	String name;
	List<NamedAPIResource> berries;
	List<Name> names;
}
