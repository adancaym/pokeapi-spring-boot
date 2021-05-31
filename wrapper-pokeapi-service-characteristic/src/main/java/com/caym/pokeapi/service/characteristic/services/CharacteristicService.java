package com.caym.pokeapi.service.characteristic.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.characteristics.Characteristic;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface CharacteristicService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Characteristic IdOrName(String idOrName);
}
