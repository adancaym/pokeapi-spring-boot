package com.caym.pokeapi.models.pokemon.abilities;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Effect;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class AbilityEffectChange {

	List<Effect> effect_entries;
	NamedAPIResource version_group;
	public List<Effect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<Effect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public NamedAPIResource getVersion_group() {
		return version_group;
	}
	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}
	
	
}
