package com.indream.amazon.service;

import com.indream.amazon.model.Employee;

public interface EmployeeService {

	boolean addEmployee(Employee employee);

	Employee selectEmpoyee(String id);
}
