package com.caym.pokeapi.models.pokemon.abilities;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VerboseEffect;

public class Ability {

	Integer id;
	String name;
	NamedAPIResource generation;
	List<Name> names;
	List<VerboseEffect> effect_entries;
	List<AbilityEffectChange> effect_changes;
	List<AbilityFlavorText> flavor_text_entries;
	List<AbilityPokemon> pokemon;
	
}
