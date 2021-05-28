package com.caym.pokeapi.models.games.gamesVersion;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Version {

	Integer id;
	String name; 
	List<Name> names;
	NamedAPIResource version_group;
}
