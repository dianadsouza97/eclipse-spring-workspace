package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee getEmployee(int theId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(theId);
	}

	@Override
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(theId);
	}

	@Override
	public Employee update(Employee emp) {
		return employeeDao.updateEmployee(emp);
	}

	@Override
	public List<Employee> getEmployeeEmail(String theEmail) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeEmail(theEmail);
	}

	

	
}
