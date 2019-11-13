package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Offer;
@Repository
public interface Offerrepository extends JpaRepository<Offer, String> {

}
