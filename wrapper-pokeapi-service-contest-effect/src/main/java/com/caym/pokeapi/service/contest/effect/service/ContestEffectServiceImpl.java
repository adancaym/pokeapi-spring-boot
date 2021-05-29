package com.caym.pokeapi.service.contest.effect.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.caym.pokeapi.models.berries.berryFlavors.BerryFlavor;
import com.caym.pokeapi.models.contest.contestEffects.ContestEffect;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

@Service
public class ContestEffectServiceImpl implements ContestEffectService {


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
	public ContestEffect IdOrName(String idOrName) {
		String url = urlBase.concat(urlApi).concat(urlApiVersion).concat(urlApiEndpoint).concat(idOrName);
		return  restClient.getForObject(url, ContestEffect.class);
	}

}
