package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Todos;
import com.example.demo.repository.TodoRepository;
@Service
@Transactional
public class TodoServiceImpl implements TodoService {
	@Autowired
	private TodoRepository todoRepository;
	@Override
	public List<Todos> getAllTodos() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}
	@Override
	public Todos findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
