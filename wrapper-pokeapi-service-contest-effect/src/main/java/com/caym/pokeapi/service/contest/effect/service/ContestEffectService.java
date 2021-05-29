package com.caym.pokeapi.service.contest.effect.service;

import java.util.Map;

import com.caym.pokeapi.models.contest.contestEffects.ContestEffect;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface ContestEffectService {

	NamedAPIResourceList Index(Map<String,String> qparams);
	ContestEffect IdOrName(String idOrName);
}
