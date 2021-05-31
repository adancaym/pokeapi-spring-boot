package com.caym.pokeapi.service.move.services;

import java.util.Map;

import com.caym.pokeapi.models.moves.moves.Move;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface MoveService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Move IdOrName(String idOrName);
}
