package com.caym.pokeapi.service.gender.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.genders.Gender;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface GenderService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Gender IdOrName(String idOrName);
}
