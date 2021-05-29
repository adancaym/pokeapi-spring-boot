package com.caym.pokeapi.service.named.services;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;


@Service
public class NamedServiceImpl implements NamedService {
		
	@Autowired
	RestTemplate restClient;
	@Value("${resource.url_base}")
	String urlBase;
	@Value("${resource.url_api}")
	String urlApi;
	@Value("${resourcer.url_api_version}")
	String urlApiVersion;
	@Value("${resource.url_endpoint_template}")
	String urlEndpointTemplate;
	@Override
	public NamedAPIResourceList named(String endpoint, Map<String,String> qparams) {
		
			String url = urlBase.concat(urlApi).concat(urlApiVersion).concat(urlEndpointTemplate);
			Map<String, String> pathVariables = new HashMap<String,String>();
			
			pathVariables.put("endpoint", endpoint);
			pathVariables.putAll(qparams);

			if(qparams.containsKey("limit") && qparams.containsKey("offset")) {
				url = url.concat("?limit={limit}&offset={offset}");
			}
			else if(qparams.containsKey("offset")) {
				url = url.concat("?offset={offset}");
			}
			else if(qparams.containsKey("limit")) {
				url = url.concat("?limit={limit}");
			}
			NamedAPIResourceList response = restClient.getForObject(url, NamedAPIResourceList.class, pathVariables);
			return response;
	}
}
