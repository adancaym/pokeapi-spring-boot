package com.caym.pokeapi.models.pokemon.pokemonForms;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonForm {

	Integer id;
	String name;
	Integer order;
	Boolean is_default;
	Boolean is_battle_only;
	Boolean is_mega;
	String form_name;
	NamedAPIResource pokemon;
	PokemonFormSprites sprites;
	NamedAPIResource version_group;
	List<Name> names;
	List<Name> form_names;
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
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Boolean getIs_default() {
		return is_default;
	}
	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}
	public Boolean getIs_battle_only() {
		return is_battle_only;
	}
	public void setIs_battle_only(Boolean is_battle_only) {
		this.is_battle_only = is_battle_only;
	}
	public Boolean getIs_mega() {
		return is_mega;
	}
	public void setIs_mega(Boolean is_mega) {
		this.is_mega = is_mega;
	}
	public String getForm_name() {
		return form_name;
	}
	public void setForm_name(String form_name) {
		this.form_name = form_name;
	}
	public NamedAPIResource getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}
	public PokemonFormSprites getSprites() {
		return sprites;
	}
	public void setSprites(PokemonFormSprites sprites) {
		this.sprites = sprites;
	}
	public NamedAPIResource getVersion_group() {
		return version_group;
	}
	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<Name> getForm_names() {
		return form_names;
	}
	public void setForm_names(List<Name> form_names) {
		this.form_names = form_names;
	}
}
