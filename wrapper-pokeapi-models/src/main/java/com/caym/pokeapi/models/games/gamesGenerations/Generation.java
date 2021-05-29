package com.caym.pokeapi.models.games.gamesGenerations;

import java.util.List;

import com.caym.pokeapi.models.pokemon.types.Type;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Generation {

	Integer id;
	String name;
	List<NamedAPIResource> abilities;
	List<Name> names;
	NamedAPIResource main_region;
	List<NamedAPIResource> moves;
	List<NamedAPIResource> pokemon_species;
	List<Type> types;
	List<NamedAPIResource> version_groups;
	
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
	public List<NamedAPIResource> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<NamedAPIResource> abilities) {
		this.abilities = abilities;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public NamedAPIResource getMain_region() {
		return main_region;
	}
	public void setMain_region(NamedAPIResource main_region) {
		this.main_region = main_region;
	}
	public List<NamedAPIResource> getMoves() {
		return moves;
	}
	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}
	public List<NamedAPIResource> getPokemon_species() {
		return pokemon_species;
	}
	public void setPokemon_species(List<NamedAPIResource> pokemon_species) {
		this.pokemon_species = pokemon_species;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public List<NamedAPIResource> getVersion_groups() {
		return version_groups;
	}
	public void setVersion_groups(List<NamedAPIResource> version_groups) {
		this.version_groups = version_groups;
	}
	
	
}
