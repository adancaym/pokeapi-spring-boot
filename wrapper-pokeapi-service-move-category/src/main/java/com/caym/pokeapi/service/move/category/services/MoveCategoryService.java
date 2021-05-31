package com.caym.pokeapi.service.move.category.services;

import java.util.Map;

import com.caym.pokeapi.models.moves.moveCategories.MoveCategory;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface MoveCategoryService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	MoveCategory IdOrName(String idOrName);
}
