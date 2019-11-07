package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class HomeController {

	private EmployeeService employeeService;
	
	
	public HomeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/employee")
	public List<Employee> getCustomers() {
		
		return employeeService.getAllEmployee();
		
	}
	
	@GetMapping("/employee/{theId}")
	public Employee getCustomer(@PathVariable int theId) {
		
		return employeeService.getEmployee(theId);
		
	}
	@GetMapping("/employee/email/{theEmail}")
	public List<Employee> getCustomerEmail(@PathVariable String theEmail) {
		
		return employeeService.getEmployeeEmail(theEmail);
		
	}
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee emp)
	{
		emp.setId(0);
		employeeService.save(emp);
		return emp;
	}
	@PutMapping("/employee")
	public Employee Update(@RequestBody Employee emp)
	{
		employeeService.update(emp);
		return emp;
	}
	@DeleteMapping("/employee/{theId}")
	public void deleteEmployee(@PathVariable int theId) {
		
		employeeService.deleteEmployee(theId);
		
	}
}
