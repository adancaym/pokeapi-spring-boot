package com.caym.pokeapi.service.version.group.services;

import java.util.Map;

import com.caym.pokeapi.models.games.gamesVersionGroups.VersionGroup;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface VersionGroupService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	VersionGroup IdOrName(String idOrName);
}
