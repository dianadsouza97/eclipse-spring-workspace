package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Offer;

@RestController
public class OfferController {
	@RequestMapping(value="/offers",method=RequestMethod.GET)
	@ResponseBody
	public List<Offer> getCurrentOffers() {
	 List<Offer> offers=new ArrayList<Offer>();
	offers.add(new Offer("Offer1", "Description1", "link1"));
	offers.add(new Offer("Offer2", "Description2", "link3"));
	offers.add(new Offer("Offer3", "Description3", "link3"));
	return offers;
	}
}
