package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao {
	public Employee save(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int theId);
	void deleteEmployee(int theId);
	public Employee updateEmployee(Employee emp);
	List<Employee> getEmployeeEmail(String theEmail);
}
