/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.Employee;
import com.example.demo.dao.EmployeeDao;

/**
 * @author b8ibmjava21
 *
 */
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
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee();
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
}
