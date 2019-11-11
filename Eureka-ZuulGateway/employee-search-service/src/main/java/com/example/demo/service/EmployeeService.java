package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDaoImpl;
import com.example.demo.entity.Employee;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;

	
	@SuppressWarnings("unchecked")
	public void saveEmployee(Employee emp) {

		  employeeDaoImpl.save(emp);

	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		return employeeDaoImpl.findAll();
	}

	public Optional<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.findById(id);
	}

	public void UpdateEmployee(Employee employee) {
		Optional<Employee> emp=employeeDaoImpl.findById(employee.getEmployeeId());
		if(emp!=null) {
			
		}
		
	}
}
