package com.caym.pokeapi.service.item.attribute.services;

import java.util.Map;

import com.caym.pokeapi.models.items.itemAttributes.ItemAttribute;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface ItemAttributeService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	ItemAttribute IdOrName(String idOrName);
}
