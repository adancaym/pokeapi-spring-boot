package com.caym.pokeapi.models.utility.commonModels;

public class VersionGameIndex {

	Integer game_index;
	NamedAPIResource version;
	public Integer getGame_index() {
		return game_index;
	}
	public void setGame_index(Integer game_index) {
		this.game_index = game_index;
	}
	public NamedAPIResource getVersion() {
		return version;
	}
	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}
}
