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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NamedAPIResource getDecreased_stat() {
		return decreased_stat;
	}
	public void setDecreased_stat(NamedAPIResource decreased_stat) {
		this.decreased_stat = decreased_stat;
	}
	public NamedAPIResource getIncreased_stat() {
		return increased_stat;
	}
	public void setIncreased_stat(NamedAPIResource increased_stat) {
		this.increased_stat = increased_stat;
	}
	public NamedAPIResource getHates_flavor() {
		return hates_flavor;
	}
	public void setHates_flavor(NamedAPIResource hates_flavor) {
		this.hates_flavor = hates_flavor;
	}
	public NamedAPIResource getLikes_flavor() {
		return likes_flavor;
	}
	public void setLikes_flavor(NamedAPIResource likes_flavor) {
		this.likes_flavor = likes_flavor;
	}
	public List<NatureStatChange> getPokeathlon_stat_changes() {
		return pokeathlon_stat_changes;
	}
	public void setPokeathlon_stat_changes(List<NatureStatChange> pokeathlon_stat_changes) {
		this.pokeathlon_stat_changes = pokeathlon_stat_changes;
	}
	public List<MoveBattleStylePreference> getMove_battle_style_preferences() {
		return move_battle_style_preferences;
	}
	public void setMove_battle_style_preferences(List<MoveBattleStylePreference> move_battle_style_preferences) {
		this.move_battle_style_preferences = move_battle_style_preferences;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
	
}
