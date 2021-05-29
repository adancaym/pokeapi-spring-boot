package com.caym.pokeapi.models.contest.contestEffects;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ContestName {
	String name;
	String color;
	NamedAPIResource language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
	
}
