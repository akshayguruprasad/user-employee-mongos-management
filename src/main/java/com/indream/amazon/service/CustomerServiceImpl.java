package com.indream.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.indream.amazon.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private MongoTemplate mongoCustomerTemplate;

	@Override
	public boolean addCustomer(Customer customer) {

		Customer object = mongoCustomerTemplate.save(customer);
		return (object != null) ? true : false;

	}

	@Override
	public Customer selectCustomer(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
