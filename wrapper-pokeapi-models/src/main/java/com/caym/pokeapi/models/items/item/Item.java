package com.caym.pokeapi.models.items.item;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.APIResource;
import com.caym.pokeapi.models.utility.commonModels.GenerationGameIndex;
import com.caym.pokeapi.models.utility.commonModels.MachineVersionDetail;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VerboseEffect;
import com.caym.pokeapi.models.utility.commonModels.VersionGroupFlavorText;

public class Item {
	Integer id;
	String name; 
	Integer cost;
	Integer fling_power;
	NamedAPIResource fling_effect;
	List<NamedAPIResource> attributes;
	NamedAPIResource category;
	List<VerboseEffect> effect_entries;
	List<VersionGroupFlavorText> flavor_text_entries;
	List<GenerationGameIndex> game_indices;
	List<Name> names;
	ItemSprites sprites;
	List<ItemHolderPokemon> held_by_pokemon;
	APIResource baby_trigger_for;
	List<MachineVersionDetail> machines;
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
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getFling_power() {
		return fling_power;
	}
	public void setFling_power(Integer fling_power) {
		this.fling_power = fling_power;
	}
	public NamedAPIResource getFling_effect() {
		return fling_effect;
	}
	public void setFling_effect(NamedAPIResource fling_effect) {
		this.fling_effect = fling_effect;
	}
	public List<NamedAPIResource> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<NamedAPIResource> attributes) {
		this.attributes = attributes;
	}
	public NamedAPIResource getCategory() {
		return category;
	}
	public void setCategory(NamedAPIResource category) {
		this.category = category;
	}
	public List<VerboseEffect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public List<VersionGroupFlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<VersionGroupFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public List<GenerationGameIndex> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(List<GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public ItemSprites getSprites() {
		return sprites;
	}
	public void setSprites(ItemSprites sprites) {
		this.sprites = sprites;
	}
	public List<ItemHolderPokemon> getHeld_by_pokemon() {
		return held_by_pokemon;
	}
	public void setHeld_by_pokemon(List<ItemHolderPokemon> held_by_pokemon) {
		this.held_by_pokemon = held_by_pokemon;
	}
	public APIResource getBaby_trigger_for() {
		return baby_trigger_for;
	}
	public void setBaby_trigger_for(APIResource baby_trigger_for) {
		this.baby_trigger_for = baby_trigger_for;
	}
	public List<MachineVersionDetail> getMachines() {
		return machines;
	}
	public void setMachines(List<MachineVersionDetail> machines) {
		this.machines = machines;
	}
	
	
}
