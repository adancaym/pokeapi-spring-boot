package com.caym.pokeapi.service.version.services;

import java.util.Map;

import com.caym.pokeapi.models.games.gamesVersion.Version;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface VersionService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Version IdOrName(String idOrName);
}
