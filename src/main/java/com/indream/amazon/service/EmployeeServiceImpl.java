package com.indream.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.indream.amazon.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private MongoTemplate mongoEmployeeTemplate;

	@Override
	public boolean addEmployee(Employee employee) {


		
		
		
		
		return false;
	}

	@Override
	public Employee selectEmpoyee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
