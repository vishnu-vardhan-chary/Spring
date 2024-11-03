package com.nit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.nit.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private static Session sess = null;
	
	@Override
	public void saveEmployee(Employee emp) {
		Transaction tx = sess.beginTransaction();
		sess.persist(emp);
		tx.commit();
	}

	@Override
	public void updateEmployee(Employee emp) {
		Transaction tx = sess.beginTransaction();
		sess.persist(emp);
		tx.commit();	
	}

	@Override
	public void deleteEmployee(Long id) {
		Transaction tx = sess.beginTransaction();
		Employee emp = getEmployee(id);
		sess.remove(emp);
		tx.commit();
	}

	@Override
	public Employee getEmployee(Long id) {
		Employee emp = sess.get(Employee.class, id);
		return emp;
	}
	
	static {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		sess = factory.openSession();
	}

	@Override
	public List<Employee> getAllEmployees() {
		Query<Employee> query = sess.createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public List<Employee> getAllEmployeesBasedOnSalary(Double salary) {
		Query<Employee> query = sess.createQuery("from Employee where salary <= :abc");
		query.setParameter("abc", salary);
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public List<Object[]> getEmployeesWithNameAndAddress() {
		Query<Object[]> query = sess.createQuery("select name,address from Employee");
		List<Object[]> employees = query.list();
		return employees;
	}

	@Override
	public List<Employee> getAllEmployeesWithNativeQuery(Double salary) {
		Query<Employee> query = sess.createNativeQuery("select * from employee where salary <= ?1").addEntity(Employee.class);
		query.setParameter(1, salary);
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public List<Employee> getAllEmployeesWithNativeQuery(String address, Double salary) {
		//Query<Employee> query = sess.createNativeQuery("select * from employee where salary <= ?1 and address= ?2 ").addEntity(Employee.class);
		//query.setParameter(1, salary);
		//query.setParameter(2, address);
		Query<Employee> query = sess.createNativeQuery("select * from employee where salary <= :salary and address= :address ").addEntity(Employee.class);
		query.setParameter("salary", salary);
		query.setParameter("address", address);
		List<Employee> employees = query.getResultList();
		return employees;
	}
}
