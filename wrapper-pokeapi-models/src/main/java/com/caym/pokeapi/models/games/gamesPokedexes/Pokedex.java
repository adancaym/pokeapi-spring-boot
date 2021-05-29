package com.caym.pokeapi.models.games.gamesPokedexes;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Pokedex {

	Integer id;
	String name;
	Boolean is_main_series;
	List<Description> descriptions;
	List<Name> names;
	List<PokemonEntry> pokemon_entries;
	NamedAPIResource region;
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
	public Boolean getIs_main_series() {
		return is_main_series;
	}
	public void setIs_main_series(Boolean is_main_series) {
		this.is_main_series = is_main_series;
	}
	public List<Description> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<PokemonEntry> getPokemon_entries() {
		return pokemon_entries;
	}
	public void setPokemon_entries(List<PokemonEntry> pokemon_entries) {
		this.pokemon_entries = pokemon_entries;
	}
	public NamedAPIResource getRegion() {
		return region;
	}
	public void setRegion(NamedAPIResource region) {
		this.region = region;
	}
	public List<NamedAPIResource> getVersion_groups() {
		return version_groups;
	}
	public void setVersion_groups(List<NamedAPIResource> version_groups) {
		this.version_groups = version_groups;
	}
	
	
}
