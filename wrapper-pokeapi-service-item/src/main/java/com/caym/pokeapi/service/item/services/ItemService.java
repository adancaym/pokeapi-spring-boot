package com.caym.pokeapi.service.item.services;

import java.util.Map;

import com.caym.pokeapi.models.items.item.Item;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface ItemService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Item IdOrName(String idOrName);
}
