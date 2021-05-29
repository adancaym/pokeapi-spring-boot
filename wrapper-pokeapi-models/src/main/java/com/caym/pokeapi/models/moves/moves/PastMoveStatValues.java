package com.caym.pokeapi.models.moves.moves;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VerboseEffect;

public class PastMoveStatValues {

	Integer accuracy;
	Integer effect_chance;
	Integer power;
	Integer pp;
	List<VerboseEffect> effect_entries;
	NamedAPIResource type;
	NamedAPIResource version_group;
	public Integer getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}
	public Integer getEffect_chance() {
		return effect_chance;
	}
	public void setEffect_chance(Integer effect_chance) {
		this.effect_chance = effect_chance;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public Integer getPp() {
		return pp;
	}
	public void setPp(Integer pp) {
		this.pp = pp;
	}
	public List<VerboseEffect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public NamedAPIResource getType() {
		return type;
	}
	public void setType(NamedAPIResource type) {
		this.type = type;
	}
	public NamedAPIResource getVersion_group() {
		return version_group;
	}
	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}
	
	
}
