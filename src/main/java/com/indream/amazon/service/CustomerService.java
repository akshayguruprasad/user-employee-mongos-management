package com.indream.amazon.service;

import com.indream.amazon.model.Customer;

public interface CustomerService {

boolean addCustomer(Customer customer);
Customer selectCustomer(String id);

}
