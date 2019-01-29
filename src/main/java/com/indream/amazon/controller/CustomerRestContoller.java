package com.indream.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indream.amazon.model.Customer;
import com.indream.amazon.service.CustomerService;

@RestController("/customer")
public class CustomerRestContoller {

	@Autowired
	private CustomerService customerService;
	// import codes from the managers

	@PostMapping("/add")
	public boolean addCustomer(Customer customer) {
		return customerService.addCustomer(customer);
		// create logic to validate and save the employee

	}

	@GetMapping("/{id}")
	public Customer selectCustomer(@PathVariable String id) {
		Customer customer = null;
		// validate the request and logic out the query to select employee

		return customer;
	}

}
