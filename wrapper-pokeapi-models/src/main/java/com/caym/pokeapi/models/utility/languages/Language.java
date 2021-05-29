package com.caym.pokeapi.models.utility.languages;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;

public class Language {
 
	Integer id;
	String name;
	Boolean official;
	String iso639;
	String iso3166;
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
	public Boolean getOfficial() {
		return official;
	}
	public void setOfficial(Boolean official) {
		this.official = official;
	}
	public String getIso639() {
		return iso639;
	}
	public void setIso639(String iso639) {
		this.iso639 = iso639;
	}
	public String getIso3166() {
		return iso3166;
	}
	public void setIso3166(String iso3166) {
		this.iso3166 = iso3166;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
