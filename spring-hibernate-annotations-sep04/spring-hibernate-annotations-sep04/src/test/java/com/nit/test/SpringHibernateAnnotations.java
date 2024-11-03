package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfiguration;
import com.nit.dao.EmployeeDao;
import com.nit.entity.Employee;

public class SpringHibernateAnnotations {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		EmployeeDao dao =ctx.getBean("dao", EmployeeDao.class);
		//dao.getAllEmployees().forEach(emp -> System.out.println(emp));
		/*
		Employee emp = dao.getEmployee(74L);
		System.out.println(emp);
		emp.setName("Murty");
		dao.updateEmployee(emp);
		emp = dao.getEmployee(74L);
		System.out.println(emp);
		*/
		/*
		Employee employee = new Employee("Hello","Ameerpet",12000D);
		dao.saveEmployee(employee);
		System.out.println("Insertion is successful");
		*/
		dao.deleteEmployee(74L);
		System.out.println("Deletion is successful");
	}

}
