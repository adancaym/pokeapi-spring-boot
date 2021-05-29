package com.caym.pokeapi.models.evolution.evolutionChains;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class EvolutionDetail {

	NamedAPIResource item;
	NamedAPIResource trigger;
	Integer gender;
	NamedAPIResource held_item;
	NamedAPIResource known_move;
	NamedAPIResource known_move_type;
	NamedAPIResource location;
	Integer min_level;
	Integer min_happiness;
	Integer min_beauty;
	Integer min_affection;
	Boolean needs_overworld_rain;
	NamedAPIResource party_species;
	NamedAPIResource party_type;
	Integer relative_physical_stats;
	String time_of_day;
	NamedAPIResource trade_species;
	Boolean turn_upside_down;
	public NamedAPIResource getItem() {
		return item;
	}
	public void setItem(NamedAPIResource item) {
		this.item = item;
	}
	public NamedAPIResource getTrigger() {
		return trigger;
	}
	public void setTrigger(NamedAPIResource trigger) {
		this.trigger = trigger;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public NamedAPIResource getHeld_item() {
		return held_item;
	}
	public void setHeld_item(NamedAPIResource held_item) {
		this.held_item = held_item;
	}
	public NamedAPIResource getKnown_move() {
		return known_move;
	}
	public void setKnown_move(NamedAPIResource known_move) {
		this.known_move = known_move;
	}
	public NamedAPIResource getKnown_move_type() {
		return known_move_type;
	}
	public void setKnown_move_type(NamedAPIResource known_move_type) {
		this.known_move_type = known_move_type;
	}
	public NamedAPIResource getLocation() {
		return location;
	}
	public void setLocation(NamedAPIResource location) {
		this.location = location;
	}
	public Integer getMin_level() {
		return min_level;
	}
	public void setMin_level(Integer min_level) {
		this.min_level = min_level;
	}
	public Integer getMin_happiness() {
		return min_happiness;
	}
	public void setMin_happiness(Integer min_happiness) {
		this.min_happiness = min_happiness;
	}
	public Integer getMin_beauty() {
		return min_beauty;
	}
	public void setMin_beauty(Integer min_beauty) {
		this.min_beauty = min_beauty;
	}
	public Integer getMin_affection() {
		return min_affection;
	}
	public void setMin_affection(Integer min_affection) {
		this.min_affection = min_affection;
	}
	public Boolean getNeeds_overworld_rain() {
		return needs_overworld_rain;
	}
	public void setNeeds_overworld_rain(Boolean needs_overworld_rain) {
		this.needs_overworld_rain = needs_overworld_rain;
	}
	public NamedAPIResource getParty_species() {
		return party_species;
	}
	public void setParty_species(NamedAPIResource party_species) {
		this.party_species = party_species;
	}
	public NamedAPIResource getParty_type() {
		return party_type;
	}
	public void setParty_type(NamedAPIResource party_type) {
		this.party_type = party_type;
	}
	public Integer getRelative_physical_stats() {
		return relative_physical_stats;
	}
	public void setRelative_physical_stats(Integer relative_physical_stats) {
		this.relative_physical_stats = relative_physical_stats;
	}
	public String getTime_of_day() {
		return time_of_day;
	}
	public void setTime_of_day(String time_of_day) {
		this.time_of_day = time_of_day;
	}
	public NamedAPIResource getTrade_species() {
		return trade_species;
	}
	public void setTrade_species(NamedAPIResource trade_species) {
		this.trade_species = trade_species;
	}
	public Boolean getTurn_upside_down() {
		return turn_upside_down;
	}
	public void setTurn_upside_down(Boolean turn_upside_down) {
		this.turn_upside_down = turn_upside_down;
	}
	
	
}
