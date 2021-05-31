package com.caym.pokeapi.service.move.target.services;

import java.util.Map;

import com.caym.pokeapi.models.moves.moveTargets.MoveTarget;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface MoveTargetService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	MoveTarget IdOrName(String idOrName);
}
