package com.caym.pokeapi.service.berry.firmness.service;

import java.util.Map;

import com.caym.pokeapi.models.berries.berryFirmnesses.BerryFirmness;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface BerryFirmnessService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	BerryFirmness IdOrName(String idOrName);
}
