package com.caym.pokeapi.models.utility.commonModels;

public class Effect {

	String effect;
	NamedAPIResource language;
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}
