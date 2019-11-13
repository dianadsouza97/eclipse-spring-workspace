package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@Controller
public class Homecontrolller {
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	@RequestMapping("/")
	public String home(Model themodel) {
		themodel.addAttribute("theDate",new Date());
		return "helloworld";
	}
	@GetMapping("/employee")
	public String listEmployee(Model themodel) {
		themodel.addAttribute("employee",employeeServiceImpl.listEmployee());
		return "helloworld";
	}

	@RequestMapping("/showform")
	public String showForm(Model theModel) {
		Employee employee=new Employee();
		theModel.addAttribute("employee",employee);
		return "employees/showform";
	}
	@RequestMapping("/save")
	public String saveForm(@ModelAttribute("employee") @Valid Employee employee,BindingResult bindingResult) {
		
			if (bindingResult.hasErrors()) {
				return "employees/showform";
			}
			else {		
				// save the employee
				employeeServiceImpl.saveEmployee(employee);
				
				// use a redirect to prevent duplicate submissions
				return "redirect:/employee";
			}
			
		
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("employeeId") int id) {
		Employee emp=employeeServiceImpl.findById(id);
		employeeServiceImpl.deleteEmployee(emp);
		return "redirect:/employee";
	}
	@RequestMapping("/update")
	public String update(@RequestParam("employeeId") int id,Model theModel) {
		Employee emp=employeeServiceImpl.findById(id);
		theModel.addAttribute("employee",emp);
		return "/employees/showform";
	}
	@GetMapping("/search")
	public String search(@RequestParam("firstName") String theFirstName,
						 @RequestParam("lastName") String theLastName,@RequestParam("email") String email,
						 Model theModel) {
		
		// check names, if both are empty then just give list of all employees

		if (theFirstName.trim().isEmpty() && theLastName.trim().isEmpty() && email.trim().isEmpty()) {
			return "redirect:/employee";
		}
		else {
			// else, search by first name and last name
			List<Employee> theEmployees =
							employeeServiceImpl.searchBy(theFirstName, theLastName,email);
			
			// add to the spring model
			theModel.addAttribute("employee", theEmployees);
			
			// send to list-employees
			return "helloworld";
		}
		
	}
}
