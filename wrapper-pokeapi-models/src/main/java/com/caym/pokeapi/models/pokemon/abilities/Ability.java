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
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<VerboseEffect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public List<AbilityEffectChange> getEffect_changes() {
		return effect_changes;
	}
	public void setEffect_changes(List<AbilityEffectChange> effect_changes) {
		this.effect_changes = effect_changes;
	}
	public List<AbilityFlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<AbilityFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public List<AbilityPokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(List<AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
	}
	
	
	
}
