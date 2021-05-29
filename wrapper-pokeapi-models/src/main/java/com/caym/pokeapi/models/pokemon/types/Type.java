package com.caym.pokeapi.models.pokemon.types;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.GenerationGameIndex;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Type {
	
	Integer id;
	String name;
	TypeRelations damage_relations;
	List<GenerationGameIndex> game_indices;
	NamedAPIResource generation;
	NamedAPIResource move_damage_class;
	List<Name> names;
	List<TypePokemon> pokemon;
	NamedAPIResource moves;
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
	public TypeRelations getDamage_relations() {
		return damage_relations;
	}
	public void setDamage_relations(TypeRelations damage_relations) {
		this.damage_relations = damage_relations;
	}
	public List<GenerationGameIndex> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(List<GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
	}
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
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
	public List<TypePokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(List<TypePokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public NamedAPIResource getMoves() {
		return moves;
	}
	public void setMoves(NamedAPIResource moves) {
		this.moves = moves;
	}
	
}
