package com.caym.pokeapi.service.move.ailment.services;

import java.util.Map;

import com.caym.pokeapi.models.moves.moveAilments.MoveAilment;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface MoveAilmentService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	MoveAilment IdOrName(String idOrName);
}
