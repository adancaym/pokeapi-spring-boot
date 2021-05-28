package com.caym.pokeapi.models.pokemon.natures;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Nature {
	Integer id;
	String name;
	NamedAPIResource decreased_stat;
	NamedAPIResource increased_stat;
	NamedAPIResource hates_flavor;
	NamedAPIResource likes_flavor;
	List<NatureStatChange> pokeathlon_stat_changes;
	List<MoveBattleStylePreference> move_battle_style_preferences;
	List<Name> names;
	
}
