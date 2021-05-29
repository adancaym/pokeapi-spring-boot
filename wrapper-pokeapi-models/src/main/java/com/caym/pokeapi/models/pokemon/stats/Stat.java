package com.caym.pokeapi.models.pokemon.stats;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.APIResource;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Stat {

	Integer id;
	String name;
	Integer game_index;
	Boolean is_battle_only;
	MoveStatAffectSets affecting_moves;
	NatureStatAffectSets affecting_natures;
	List<APIResource> characteristics;
	NamedAPIResource move_damage_class;
	List<Name> names;
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
	public Integer getGame_index() {
		return game_index;
	}
	public void setGame_index(Integer game_index) {
		this.game_index = game_index;
	}
	public Boolean getIs_battle_only() {
		return is_battle_only;
	}
	public void setIs_battle_only(Boolean is_battle_only) {
		this.is_battle_only = is_battle_only;
	}
	public MoveStatAffectSets getAffecting_moves() {
		return affecting_moves;
	}
	public void setAffecting_moves(MoveStatAffectSets affecting_moves) {
		this.affecting_moves = affecting_moves;
	}
	public NatureStatAffectSets getAffecting_natures() {
		return affecting_natures;
	}
	public void setAffecting_natures(NatureStatAffectSets affecting_natures) {
		this.affecting_natures = affecting_natures;
	}
	public List<APIResource> getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(List<APIResource> characteristics) {
		this.characteristics = characteristics;
	}
	public NamedAPIResource getMove_damage_class() {
		return move_damage_class;
	}
	public void setMove_damage_class(NamedAPIResource move_damage_class) {
		this.move_damage_class = move_damage_class;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
}
