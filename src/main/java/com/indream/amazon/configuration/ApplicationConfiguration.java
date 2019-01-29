package com.indream.amazon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.indream.amazon.service.CustomerService;
import com.indream.amazon.service.CustomerServiceImpl;
import com.indream.amazon.service.EmployeeService;
import com.indream.amazon.service.EmployeeServiceImpl;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public CustomerService getCustomerServiceBean() {
		return new CustomerServiceImpl();// create customer service bean
	}

	@Bean
	public EmployeeService getEmployeeServiceBean() {

		return new EmployeeServiceImpl();// create employee service bean

	}

}
