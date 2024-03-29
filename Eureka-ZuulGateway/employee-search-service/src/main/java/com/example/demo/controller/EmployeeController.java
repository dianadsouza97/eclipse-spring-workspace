package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/employee")
	public void saveEmployee(@RequestBody Employee employee) {
		 employeeService.saveEmployee(employee);
	}
	
	@PostMapping("/employee/{id}")
	public Optional<Employee> findById(@PathVariable Long id ) {
		return employeeService.findById(id);
	}
	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employee employee)
	{
		employeeService.UpdateEmployee(employee);
	}
}
