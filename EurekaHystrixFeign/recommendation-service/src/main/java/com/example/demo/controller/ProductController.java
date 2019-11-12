package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.RecommendationService;
@RestController
public class ProductController {
	@Autowired
	private RecommendationService recommendationService;
	
	@RequestMapping(value="/recommendation",method=RequestMethod.GET)
	 @ResponseBody
	    public List<Product> getCurrentOffers() {
		/*
		 * List<Product> products = new ArrayList<Product>(); products.add(new
		 * Product("Product1", "Description1", "link1")); products.add(new
		 * Product("Product2", "Description2", "link3")); products.add(new
		 * Product("Product3", "Description3", "link3"));
		 */
	        return recommendationService.getAllRecommendations();
	    }
}
