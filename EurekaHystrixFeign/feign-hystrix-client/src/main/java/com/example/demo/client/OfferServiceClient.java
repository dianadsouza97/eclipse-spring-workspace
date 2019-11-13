package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Offer;
import com.example.demo.model.Product;

@FeignClient("offer-service")
public interface OfferServiceClient {
	@RequestMapping(value = "/offers", method = RequestMethod.GET)
	public List<Offer> getCurrentOffers();

	@RequestMapping(value = "/saveOffer", method = RequestMethod.POST)
	public void saveOffer( Offer offer);
}
