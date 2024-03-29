package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Employee;
@Repository
public class EmployeedaoImpl implements EmployeeDao {
	private EntityManager entityManager;

	@Autowired
	public EmployeedaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public Employee save(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(employee);
		return employee;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployee() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("from Employee",Employee.class);
		List<Employee> customers = theQuery.getResultList();	
		return customers;
	}

	@Override
	public Employee getEmployee(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee=currentSession.get(Employee.class, theId);
		/*if(customer==null)
		{
			 ("Cuistomer with nthe given id is not found: "+theId);
		}*/
		
		return employee;
	}

	


	@Override
	public void deleteEmployee(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee=currentSession.get(Employee.class, theId);
		
		currentSession.remove(employee);
		
	}

	
	
}

