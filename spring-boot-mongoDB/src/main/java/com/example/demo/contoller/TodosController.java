package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todos;
import com.example.demo.service.TodoService;

@RestController
public class TodosController {
	@Autowired
	private TodoService todoService;
	@RequestMapping("/todos")
	public List<Todos> getAllTodos(){
		return todoService.getAllTodos();
	}
}
