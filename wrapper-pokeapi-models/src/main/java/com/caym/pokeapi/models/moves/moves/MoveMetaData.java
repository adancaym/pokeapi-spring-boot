package com.caym.pokeapi.models.moves.moves;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveMetaData {
	NamedAPIResource ailment;
	NamedAPIResource category;
	Integer min_hits;
	Integer max_hits;
	Integer min_turns;
	Integer max_turns;
	Integer healing;
	Integer drain;
	Integer crit_rate;
	Integer ailment_chance;
	Integer flinch_chance;
	Integer stat_chance;
	public NamedAPIResource getAilment() {
		return ailment;
	}
	public void setAilment(NamedAPIResource ailment) {
		this.ailment = ailment;
	}
	public NamedAPIResource getCategory() {
		return category;
	}
	public void setCategory(NamedAPIResource category) {
		this.category = category;
	}
	public Integer getMin_hits() {
		return min_hits;
	}
	public void setMin_hits(Integer min_hits) {
		this.min_hits = min_hits;
	}
	public Integer getMax_hits() {
		return max_hits;
	}
	public void setMax_hits(Integer max_hits) {
		this.max_hits = max_hits;
	}
	public Integer getMin_turns() {
		return min_turns;
	}
	public void setMin_turns(Integer min_turns) {
		this.min_turns = min_turns;
	}
	public Integer getMax_turns() {
		return max_turns;
	}
	public void setMax_turns(Integer max_turns) {
		this.max_turns = max_turns;
	}
	public Integer getHealing() {
		return healing;
	}
	public void setHealing(Integer healing) {
		this.healing = healing;
	}
	public Integer getDrain() {
		return drain;
	}
	public void setDrain(Integer drain) {
		this.drain = drain;
	}
	public Integer getCrit_rate() {
		return crit_rate;
	}
	public void setCrit_rate(Integer crit_rate) {
		this.crit_rate = crit_rate;
	}
	public Integer getAilment_chance() {
		return ailment_chance;
	}
	public void setAilment_chance(Integer ailment_chance) {
		this.ailment_chance = ailment_chance;
	}
	public Integer getFlinch_chance() {
		return flinch_chance;
	}
	public void setFlinch_chance(Integer flinch_chance) {
		this.flinch_chance = flinch_chance;
	}
	public Integer getStat_chance() {
		return stat_chance;
	}
	public void setStat_chance(Integer stat_chance) {
		this.stat_chance = stat_chance;
	}
	
	

}
