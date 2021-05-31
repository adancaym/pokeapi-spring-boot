package com.caym.pokeapi.service.pokemon.form.services;

import java.util.Map;

import com.caym.pokeapi.models.pokemon.pokemonForms.PokemonForm;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface PokemonFormService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	PokemonForm IdOrName(String idOrName);
}
