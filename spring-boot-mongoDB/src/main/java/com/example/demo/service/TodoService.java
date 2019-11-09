package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Todos;

public interface TodoService {
	public List<Todos> getAllTodos();
	public Todos findById();
}
