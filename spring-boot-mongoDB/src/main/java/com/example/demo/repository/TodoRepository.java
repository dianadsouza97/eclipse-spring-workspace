package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todos;
@Repository
public interface TodoRepository extends MongoRepository<Todos, String> {
	
}
