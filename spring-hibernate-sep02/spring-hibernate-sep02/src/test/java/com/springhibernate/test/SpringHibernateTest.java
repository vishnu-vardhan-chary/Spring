package com.springhibernate.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.dao.EmployeeDao;
import com.nit.entity.Employee;

public class SpringHibernateTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao = ctx.getBean("dao", EmployeeDao.class);
		Employee emp = new Employee("Hello44444", "World44444", 12000d);
		dao.saveEmployee(emp);
		System.out.println("Save is successful!!");
		/*
		Employee emp = dao.getEmployee(66L);
		System.out.println(emp);
		emp.setName("ABCDEFGHIJKLMNOPQ");
		dao.updateEmployee(emp);
		emp = dao.getEmployee(66L);
		System.out.println(emp);
		*/
		//dao.deleteEmployee(67L);
		//System.out.println("Deletion si successful!!!");
		//for(Employee emp : dao.getAllEmployees())
			//System.out.println(emp);
		//dao.getAllEmployees().forEach(emp -> System.out.println(emp));
		

	}

}
