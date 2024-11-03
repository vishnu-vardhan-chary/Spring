package com.nit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nit.dao.EmployeeDaoImpl;
import com.nit.entity.Employee;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.nit"})
public class AppConfiguration {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/nareshit-4pm");
		dataSource.setUsername("root");
		dataSource.setPassword("techno");
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		Properties props = new Properties();
		props.setProperty("hibernate.show_sql", "false");
		props.setProperty("hibernate.format_sql", "true");
		sessionFactory.setHibernateProperties(props);
		sessionFactory.setAnnotatedClasses(Employee.class);
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}
	
	@Bean
	public EmployeeDaoImpl dao() {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		dao.setSessionFactory(sessionFactory().getObject());
		return dao;
	}
	
}
