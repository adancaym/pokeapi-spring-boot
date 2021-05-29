package com.caym.pokeapi.service.berry.flavor.service;

import java.util.Map;

import com.caym.pokeapi.models.berries.berryFlavors.BerryFlavor;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface BerryFlavorService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	BerryFlavor IdOrName(String idOrName);
}
