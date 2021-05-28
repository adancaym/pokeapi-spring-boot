package com.caym.pokeapi.models.pokemon.pokemonForms;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonForm {

	Integer id;
	String name;
	Integer order;
	Boolean is_default;
	Boolean is_battle_only;
	Boolean is_mega;
	String form_name;
	NamedAPIResource pokemon;
	PokemonFormSprites sprites;
	NamedAPIResource version_group;
	List<Name> names;
	List<Name> form_names;
}
