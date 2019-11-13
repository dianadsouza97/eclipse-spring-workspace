package com.example.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Offer;
import com.example.demo.model.Product;

@RestController
public class MainController {

	@Autowired
	private IntegrationClient integrationClient;

	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/offersAndRecommendation", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Map<String, Collection> offersAndRecommendation() {
		Map<String, Collection> result = new HashMap<String, Collection>();
		result.put("offers", integrationClient.getOffers());
		result.put("recommendations", integrationClient.getRecommendations());
		return result;
	}
	@PostMapping(value="/saveAll")
	public void saveAll(@RequestBody Offer offer) {
		integrationClient.saveOffer(offer);
		//integrationClient.saveProduct(product);
	}
}
