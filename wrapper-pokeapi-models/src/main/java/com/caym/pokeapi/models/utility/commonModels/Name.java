package com.caym.pokeapi.models.utility.commonModels;

import java.io.Serializable;

public class Name implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8633614819265195326L;
	String name;
	NamedAPIResource language;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
	
}
