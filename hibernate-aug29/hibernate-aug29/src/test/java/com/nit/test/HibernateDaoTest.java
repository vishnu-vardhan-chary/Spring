package com.nit.test;

import com.nit.dao.EmployeeDao;
import com.nit.dao.EmployeeDaoImpl;
import com.nit.entity.Employee;

public class HibernateDaoTest {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		//Employee emp = new Employee(61L,"Muirty","Panjagutta",50000d);
		//dao.updateEmployee(emp);
		//System.out.println("Save is successfull!!");
		/*
		Employee emp = dao.getEmployee(33L);
		System.out.println(emp);
		emp.setName("Praveen-123");
		dao.updateEmployee(emp);
		*/
		//dao.deleteEmployee(33L);
		//System.out.println("Delete is successfull!!");
		
		//for(Employee emp : dao.getAllEmployees())
		//	System.out.println(emp);
		
		//for(Employee emp : dao.getAllEmployeesBasedOnSalary(50000D))
			//System.out.println(emp);
		
		//for(Object[] columns : dao.getEmployeesWithNameAndAddress())
		//	System.out.println(columns[0]+"\t"+columns[1]);
		
		//for(Employee emp : dao.getAllEmployeesWithNativeQuery(10000D))
			//System.out.println(emp);
		
		//for(Employee emp : dao.getAllEmployeesWithNativeQuery("JNTU",15000D))
			//System.out.println(emp);
		
		Employee emp = new Employee("Muirty-12345","Panjagutta",50000d);
		dao.saveEmployee(emp);
		System.out.println("Save is successfull!!");
	}
}
