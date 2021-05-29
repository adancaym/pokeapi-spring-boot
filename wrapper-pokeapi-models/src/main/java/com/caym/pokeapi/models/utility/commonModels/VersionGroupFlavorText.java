package com.caym.pokeapi.models.utility.commonModels;

public class VersionGroupFlavorText {

	String text;
	NamedAPIResource language;
	NamedAPIResource version_group;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
	public NamedAPIResource getVersion_group() {
		return version_group;
	}
	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}
} 
