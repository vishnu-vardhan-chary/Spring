package com.nit.dao;

import java.util.List;

import com.nit.entity.Employee;

public interface EmployeeDao {
	void saveEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Long id);
	Employee getEmployee(Long id);
	List<Employee> getAllEmployees();
	List<Employee> getAllEmployeesBasedOnSalary(Double salary);
	List<Object[]> getEmployeesWithNameAndAddress();
	List<Employee> getAllEmployeesWithNativeQuery(Double salary);
	List<Employee> getAllEmployeesWithNativeQuery(String address,Double salary);
}
