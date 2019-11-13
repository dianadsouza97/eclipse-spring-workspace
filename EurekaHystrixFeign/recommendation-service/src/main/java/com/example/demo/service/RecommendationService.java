package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Product;
import com.example.demo.repository.RecommendationRepository;

@Service
@Transactional
public class RecommendationService {
@Autowired
private RecommendationRepository recommendationRepository;
	public List<Product> getAllRecommendations() {
		// TODO Auto-generated method stub
		return recommendationRepository.findAll();
	}
	public Product createRecommendation(Product product) {
		// TODO Auto-generated method stub
		return recommendationRepository.save(product);
	}

}
