package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Offer;
import com.example.demo.repository.Offerrepository;
@Service
@Transactional
public class ServiceImpl {
	@Autowired
	private Offerrepository offerrepository;
	
	public ServiceImpl(Offerrepository offerrepository) {
		super();
		this.offerrepository = offerrepository;
	}
	public List<Offer> getAllOffers() {
		
		return offerrepository.findAll();
	}
	public void createOffer(Offer offer) {
		// TODO Auto-generated method stub
		offerrepository.save(offer);
	}

}
