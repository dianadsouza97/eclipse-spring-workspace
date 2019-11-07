package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {
	private List<Customer> customers;
	Logger log=LoggerFactory.getLogger(CustomerController.class);
	
	@PostConstruct
	public void init() {
		customers=new ArrayList<Customer>();
		customers.add(new Customer("John", "Doe", "john@spring.io"));
		customers.add(new Customer("Shane", "Warne", "shane@luv2code.com"));
	}
	@GetMapping("/customers")
	public List<Customer> getAllCustomer()
	{
		return customers;
	}
	@PostMapping("/customers")
	public void save(@RequestBody Customer theCustomer)
	{
		
		customers.add(new Customer(theCustomer.getFirstName(),theCustomer.getLastName(),theCustomer.getEmail()));
	}
	
	
	  @GetMapping("/customers/{firstName}") 
	  public Customer getCustomer(@PathVariable String firstName) {
		  Customer cust=null;
		  for(int i=0;i<customers.size();i++) {
			  if(customers.get(i).getFirstName()==firstName) {
				   cust= customers.get(i);
				  
			  }
		  }
		  return cust;
	  
	  }
}
	  
	 /* 
	  @PutMapping("/customers") public Customer updateCustomer(@RequestBody
	  Customer theCustomer) { customerService.save(theCustomer); return
	  theCustomer; }
	  
	  @DeleteMapping("/customers/{theId}") public void deleteCustomer(@PathVariable
	  int theId) { customerService.deleteCustomer(theId); }
	 
	
	
	@PreDestroy
	public void destroy()
	{
		log.info("pre destroy worked..");
		customers=null;
	}
}*/
