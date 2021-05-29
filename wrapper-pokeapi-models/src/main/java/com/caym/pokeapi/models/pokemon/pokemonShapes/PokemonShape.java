package com.caym.pokeapi.models.pokemon.pokemonShapes;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonShape {

	Integer id;
	String name;
	List<AwesomeName> awesome_names;
	List<Name> names;
	List<NamedAPIResource> pokemon_species;
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
	public List<AwesomeName> getAwesome_names() {
		return awesome_names;
	}
	public void setAwesome_names(List<AwesomeName> awesome_names) {
		this.awesome_names = awesome_names;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<NamedAPIResource> getPokemon_species() {
		return pokemon_species;
	}
	public void setPokemon_species(List<NamedAPIResource> pokemon_species) {
		this.pokemon_species = pokemon_species;
	}
	
}
