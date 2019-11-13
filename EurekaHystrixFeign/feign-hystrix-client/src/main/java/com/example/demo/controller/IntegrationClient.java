package com.example.demo.controller;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.client.OfferServiceClient;
import com.example.demo.client.RecommendationServiceClient;
import com.example.demo.model.Offer;
import com.example.demo.model.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class IntegrationClient {

	@Autowired
	private OfferServiceClient offersClient;

	@Autowired
	private RecommendationServiceClient recommendationClient;

	public Collection<Product> getRecommendationFallback() {
		System.out.println("=======getRecommendationFallback=========");
		return Arrays.asList();
	}

	@HystrixCommand(fallbackMethod = "getRecommendationFallback")
	public Collection<Product> getRecommendations() {
		return this.recommendationClient.getRecommendations();
	}
	@HystrixCommand(fallbackMethod = "getRecommendationFallback")
	public void saveProduct(Product product) {
		 this.recommendationClient.saveProduct(product);
	}

	public Collection<Offer> getOffersFallback() {
		System.out.println("===========getOffersFallback===========");
		return Arrays.asList();
	}
	public void saveOffersFallback(Offer offer) {
		System.out.println("===========getOffersFallback===========");
		
	}

	@HystrixCommand(fallbackMethod = "getOffersFallback")
	public Collection<Offer> getOffers() {
		return this.offersClient.getCurrentOffers();
	}
	@HystrixCommand(fallbackMethod = "saveOffersFallback")
	public void saveOffer(Offer offer) {
		 this.offersClient.saveOffer(offer);
	}

}

