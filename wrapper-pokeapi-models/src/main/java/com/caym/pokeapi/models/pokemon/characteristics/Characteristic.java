package com.caym.pokeapi.models.pokemon.characteristics;

import java.util.List;

public class Characteristic {

	Integer id;
	Integer gene_modulo;
	List<Integer> possible_values;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGene_modulo() {
		return gene_modulo;
	}
	public void setGene_modulo(Integer gene_modulo) {
		this.gene_modulo = gene_modulo;
	}
	public List<Integer> getPossible_values() {
		return possible_values;
	}
	public void setPossible_values(List<Integer> possible_values) {
		this.possible_values = possible_values;
	}
	
	
	
}
