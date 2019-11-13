package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl {
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> listEmployee() {
		return employeeRepository.findAll();
	}

	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public Employee findById(int id) {
		Optional<Employee> result = employeeRepository.findById(id);

		Employee theEmployee = null;

		if (result.isPresent()) {
			theEmployee = result.get();
		} else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + id);
		}

		return theEmployee;
	}

	public void deleteEmployee(Employee emp) {
		employeeRepository.delete(emp);
	}

	public List<Employee> searchBy(String theFirstName, String theLastName, String email) {
		// TODO Auto-generated method stub
		return employeeRepository.findByFirstNameContainsAndLastNameContainsAndEmailContainsAllIgnoreCase(theFirstName,
				theLastName, email);
	}

	public void delete(int id) {
		employeeRepository.deleteById(id);
	}

}
