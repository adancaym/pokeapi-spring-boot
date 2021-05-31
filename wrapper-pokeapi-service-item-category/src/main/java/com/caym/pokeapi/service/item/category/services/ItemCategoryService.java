package com.caym.pokeapi.service.item.category.services;

import java.util.Map;

import com.caym.pokeapi.models.items.itemCategory.ItemCategory;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface ItemCategoryService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	ItemCategory IdOrName(String idOrName);
}
