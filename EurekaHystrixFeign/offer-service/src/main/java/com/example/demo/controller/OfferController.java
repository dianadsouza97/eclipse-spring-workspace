package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Offer;
import com.example.demo.service.ServiceImpl;

@RestController
public class OfferController {
	
	
	@Autowired
	private ServiceImpl serviceImpl;
	@ResponseBody
	@RequestMapping(value="/offers",method=RequestMethod.GET)
	public List<Offer> getCurrentOffers() {
		/*
		 * List<Offer> offers=new ArrayList<Offer>(); offers.add(new Offer("Offer1",
		 * "Description1", "link1")); offers.add(new Offer("Offer2", "Description2",
		 * "link3")); offers.add(new Offer("Offer3", "Description3", "link3"));
		 */
		
	return serviceImpl.getAllOffers();
	}
	@PostMapping(value="/saveOffer")
	public void saveOffer(Offer offer) {
		 serviceImpl.createOffer(offer);
	}
}
