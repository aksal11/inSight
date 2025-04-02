package com.example.inSight.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class MarsWeatherServices {
	
	private static final String API_URL = "https://api.nasa.gov/insight_weather/?api_key=DEMO_KEY&feedtype=json&ver=1.0";
	
	private static RestTemplate restTemplate;
	
	public MarsWeatherServices() {
		this.restTemplate = new RestTemplate();
	}
	
	public JsonNode getWeatherService() {
		return restTemplate.getForObject(API_URL, JsonNode.class);
	}

}
