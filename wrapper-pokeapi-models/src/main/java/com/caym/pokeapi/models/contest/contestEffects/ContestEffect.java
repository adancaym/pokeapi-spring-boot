package com.caym.pokeapi.models.contest.contestEffects;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Effect;
import com.caym.pokeapi.models.utility.commonModels.FlavorText;

public class ContestEffect {

	Integer id;
	Integer appeal;
	Integer jam;
	List<Effect> effect_entries;
	List<FlavorText> flavor_text_entries;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAppeal() {
		return appeal;
	}
	public void setAppeal(Integer appeal) {
		this.appeal = appeal;
	}
	public Integer getJam() {
		return jam;
	}
	public void setJam(Integer jam) {
		this.jam = jam;
	}
	public List<Effect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<Effect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public List<FlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	
	
}
