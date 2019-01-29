package com.indream.amazon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indream.amazon.model.Employee;

@RestController("/employee")
public class EmployeeRestController {

	//import codes from the managers
	
	@PostMapping("/add")
	public boolean addEmployee(Employee employee) {
	
		//create logic to validate and save the employee
		return false;
	}
	
	
	@GetMapping("/{id}")
	public Employee selectEmployee(@PathVariable String id) {
		Employee employee=null;
		//validate the request and logic out the query to select employee
		
		
		
		return employee;		
	}
	
	
}
