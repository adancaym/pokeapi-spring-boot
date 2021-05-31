package com.caym.pokeapi.service.move.battle.style.services;

import java.util.Map;

import com.caym.pokeapi.models.moves.moveAilments.MoveBattleStyle;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface MoveBattleStyleService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	MoveBattleStyle IdOrName(String idOrName);
}
