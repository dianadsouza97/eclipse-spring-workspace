package com.example.demo.service;

import java.util.List;

import com.example.demo.Employee;

public interface EmployeeService {
	public Employee save(Employee employee);
	public List<Employee> getEmployee();
	public Employee getEmployee(int theId);
	void deleteEmployee(int theId);
	
}
