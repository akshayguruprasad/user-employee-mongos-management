package com.indream.amazon.util;

import java.lang.reflect.Field;

import com.indream.amazon.model.Customer;
import com.indream.amazon.model.Employee;

public class Utility {

	private static final String[] EMPLOYEE_ADD_FILEDS = { "empName", "empContact", "empEmail", "empSalary", "empRole" };

	public static boolean validateAddEmployee(Employee employee) {

		checkNullFileds(Employee.class, employee, EMPLOYEE_ADD_FILEDS);

		return false;

	}

	public static boolean validateSelectEmployee(String id) {

		return false;
	}

	public static boolean validateAddCustomer(Customer customer) {
		return false;
	}

	public static boolean validateSelectCustomer(String id) {
		return false;
	}

	private static <T> boolean checkNullFileds(Class<T> clazz, T object, String[] array) {

		if (clazz.isInstance(object)) {

			for (String field : array) {

				try {
					Field objectFieldValue = object.getClass().getField(field);
					objectFieldValue.setAccessible(true);
					try {
						Object value = objectFieldValue.get(object);
						System.out.println(value);
						if (value == null) {
							return false;
						}

					} catch (IllegalArgumentException | IllegalAccessException e) {
						System.err.println("inner try-catch exception");
						e.printStackTrace();
					}

				} catch (NoSuchFieldException | SecurityException e) {
					e.printStackTrace();
				}

			}

		}

		return false;

	}

}
