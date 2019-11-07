package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
public interface EmployeeService {
	public Employee save(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int theId);
	void deleteEmployee(int theId);
	public Employee update(Employee emp);
	public List<Employee> getEmployeeEmail(String theEmail);
	
}
