package com.caym.pokeapi.service.item.fling.effect.services;

import java.util.Map;

import com.caym.pokeapi.models.items.itemFlingEffects.ItemFlingEffect;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface ItemFlingEffectService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	ItemFlingEffect IdOrName(String idOrName);
}
