package com.caym.pokeapi.service.berry.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.caym.pokeapi.models.berries.berries.Berry;
import com.caym.pokeapi.models.berries.berryFirmnesses.BerryFirmness;
import com.caym.pokeapi.models.berries.berryFlavors.BerryFlavor;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

@Service
public class BerryServiceImpl implements BerryService {

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
	public Berry IdOrName(String idOrName) {
		String url = urlBase.concat(urlApi).concat(urlApiVersion).concat(urlApiEndpoint).concat(idOrName);
		return  restClient.getForObject(url, Berry.class);
	}


}
