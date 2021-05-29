package com.caym.pokeapi.models.pokemon.pokemon;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VersionGameIndex;

public class Pokemon {
	Integer id;
	String name;
	Integer base_experience;
	Integer height;
	Boolean is_default;
	Integer order;
	Integer weight;
	List<PokemonAbility> abilities;
	List<NamedAPIResource> forms;
	List<VersionGameIndex> game_indices;
	List<PokemonHeldItem> held_items;
	String location_area_encounters;
	List<PokemonMove> moves;
	PokemonSprites sprites;
	NamedAPIResource species;
	List<PokemonStat> stats;
	List<PokemonType> types;
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
	public Integer getBase_experience() {
		return base_experience;
	}
	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Boolean getIs_default() {
		return is_default;
	}
	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public List<PokemonAbility> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<PokemonAbility> abilities) {
		this.abilities = abilities;
	}
	public List<NamedAPIResource> getForms() {
		return forms;
	}
	public void setForms(List<NamedAPIResource> forms) {
		this.forms = forms;
	}
	public List<VersionGameIndex> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(List<VersionGameIndex> game_indices) {
		this.game_indices = game_indices;
	}
	public List<PokemonHeldItem> getHeld_items() {
		return held_items;
	}
	public void setHeld_items(List<PokemonHeldItem> held_items) {
		this.held_items = held_items;
	}
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}
	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	public List<PokemonMove> getMoves() {
		return moves;
	}
	public void setMoves(List<PokemonMove> moves) {
		this.moves = moves;
	}
	public PokemonSprites getSprites() {
		return sprites;
	}
	public void setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
	}
	public NamedAPIResource getSpecies() {
		return species;
	}
	public void setSpecies(NamedAPIResource species) {
		this.species = species;
	}
	public List<PokemonStat> getStats() {
		return stats;
	}
	public void setStats(List<PokemonStat> stats) {
		this.stats = stats;
	}
	public List<PokemonType> getTypes() {
		return types;
	}
	public void setTypes(List<PokemonType> types) {
		this.types = types;
	}
}
