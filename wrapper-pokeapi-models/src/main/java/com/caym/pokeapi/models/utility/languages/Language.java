package com.caym.pokeapi.models.utility.languages;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;

public class Language {
 
	Integer id;
	String name;
	Boolean official;
	String iso639;
	String iso3166;
	List<Name> names;
	
}
