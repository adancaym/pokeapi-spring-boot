package com.caym.pokeapi.service.type.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.caym.pokeapi.models.pokemon.types.Type;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	RestTemplate restClient;
	@Value("${resource.url_base}")
	String urlBase;
	@Value("${resource.url_api}")
	String urlApi;
	@Value("${resource.url_api_version}")
	String urlApiVersion;
	@Value("${resource.url_api_endpoint}")
	String urlApiEndpoint;
	@Override
	public NamedAPIResourceList Index(Map<String, String> qparams) {
		String url = urlBase.concat(urlApi).concat(urlApiVersion).concat(urlApiEndpoint);
		if(qparams.containsKey("limit") && qparams.containsKey("offset")) {
			url = url.concat("?limit={limit}&offset={offset}");
		}
		else if(qparams.containsKey("offset")) {
			url = url.concat("?offset={offset}");
		}
		else if(qparams.containsKey("limit")) {
			url = url.concat("?limit={limit}");
		}
		return  restClient.getForObject(url, NamedAPIResourceList.class, qparams);
	}

	@Override
	public Type IdOrName(String idOrName) {
		String url = urlBase.concat(urlApi).concat(urlApiVersion).concat(urlApiEndpoint).concat(idOrName);
		return  restClient.getForObject(url, Type.class);
	}


}
