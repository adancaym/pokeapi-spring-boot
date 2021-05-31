package com.caym.pokeapi.service.language.services;

import java.util.Map;


import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;
import com.caym.pokeapi.models.utility.languages.Language;

public interface LanguageService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Language IdOrName(String idOrName);
}
