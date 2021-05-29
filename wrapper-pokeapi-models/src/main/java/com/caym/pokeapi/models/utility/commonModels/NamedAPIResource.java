package com.caym.pokeapi.models.utility.commonModels;

import java.io.Serializable;

public class NamedAPIResource  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1309146943571838380L;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	String url;
}
