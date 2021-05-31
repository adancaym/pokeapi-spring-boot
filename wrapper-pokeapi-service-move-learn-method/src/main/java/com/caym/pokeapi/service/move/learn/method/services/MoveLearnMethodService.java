package com.caym.pokeapi.service.move.learn.method.services;

import java.util.Map;

import com.caym.pokeapi.models.moves.moveLearnMethods.MoveLearnMethod;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface MoveLearnMethodService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	MoveLearnMethod IdOrName(String idOrName);
}
