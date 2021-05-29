package com.caym.pokeapi.models.berries.berries;


import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class BerryFlavorMap {

	Integer portency;
	NamedAPIResource flavor;
	public Integer getPortency() {
		return portency;
	}
	public void setPortency(Integer portency) {
		this.portency = portency;
	}
	public NamedAPIResource getFlavor() {
		return flavor;
	}
	public void setFlavor(NamedAPIResource flavor) {
		this.flavor = flavor;
	}
	
	
}
