package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private EntityManager entityManager;

	@Autowired
	public EmployeeDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public Employee save(Employee employee) {
		Employee emp=entityManager.merge(employee);
		employee.setId(emp.getId());
		return employee;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {

		Query theQuery = entityManager.createQuery("from Employee", Employee.class);
		return theQuery.getResultList();
		
	}

	@Override
	public Employee getEmployee(int theId) {
		Employee employee=entityManager.find(Employee.class,theId);
		return employee;
	}

	@Override
	public void deleteEmployee(int theId) {
		Employee emp=entityManager.find(Employee.class,theId);
		entityManager.remove(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		save(emp);
		return emp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeeEmail(String theEmail) {
		Query theQuery = entityManager.createQuery("from Employee e where e.email=:Email");
		theQuery.setParameter("Email",theEmail);
		return theQuery.getResultList();
	}

}
