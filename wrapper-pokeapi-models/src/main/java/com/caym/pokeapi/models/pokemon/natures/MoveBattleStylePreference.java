package com.caym.pokeapi.models.pokemon.natures;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveBattleStylePreference {

	Integer low_hp_preference;
	Integer high_hp_preference;
	NamedAPIResource move_battle_style;
	public Integer getLow_hp_preference() {
		return low_hp_preference;
	}
	public void setLow_hp_preference(Integer low_hp_preference) {
		this.low_hp_preference = low_hp_preference;
	}
	public Integer getHigh_hp_preference() {
		return high_hp_preference;
	}
	public void setHigh_hp_preference(Integer high_hp_preference) {
		this.high_hp_preference = high_hp_preference;
	}
	public NamedAPIResource getMove_battle_style() {
		return move_battle_style;
	}
	public void setMove_battle_style(NamedAPIResource move_battle_style) {
		this.move_battle_style = move_battle_style;
	}
	
	
}
