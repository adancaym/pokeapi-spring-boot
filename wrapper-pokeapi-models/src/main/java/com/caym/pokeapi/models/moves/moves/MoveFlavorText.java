package com.caym.pokeapi.models.moves.moves;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class MoveFlavorText {

	String flavor_text;
	NamedAPIResource language;
	NamedAPIResource version_group;
	public String getFlavor_text() {
		return flavor_text;
	}
	public void setFlavor_text(String flavor_text) {
		this.flavor_text = flavor_text;
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
