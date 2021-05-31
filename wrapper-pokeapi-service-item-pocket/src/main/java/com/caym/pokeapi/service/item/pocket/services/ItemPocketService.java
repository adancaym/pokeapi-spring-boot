package com.caym.pokeapi.service.item.pocket.services;

import java.util.Map;

import com.caym.pokeapi.models.items.itemPocket.ItemPocket;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface ItemPocketService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	ItemPocket IdOrName(String idOrName);
}
