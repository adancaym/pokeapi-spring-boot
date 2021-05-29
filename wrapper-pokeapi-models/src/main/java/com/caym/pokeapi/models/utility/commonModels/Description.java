package com.caym.pokeapi.models.utility.commonModels;

public class Description {

	String description;
	NamedAPIResource language;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}
