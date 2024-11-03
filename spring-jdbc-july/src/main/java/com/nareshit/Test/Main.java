package com.nareshit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.dao.StudentDao;
import com.nareshit.model.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

				StudentDao dao = (StudentDao)ctx.getBean("dao");
				
				//Test to save Student Object
				Student st = new Student(3,"saptha","sapthagiri");
				dao.saveStudent(st);
				System.out.println("Student record is successfully inserted..");
				
		        //Test to get a Student and update the student too
//		        Student s1 = dao.getStudent(3);
//		        System.out.println(s1);
//		        System.out.println("Student record read is successfull..");
//		        
//		        s1.setFirstName("Praveen-1");
//		        s1.setLastName("Praveen-2");
//		        dao.updateStudent(s1);
//		        System.out.println("Student record is successfully updated..");
		        
		        //Test to get all the student records from database
//		        for(Student s : dao.getAllStudents())
//		        System.out.println(s);
		        
		        //Test to delete a student record from database table
//		        dao.deleteStudent(3);
//		        System.out.println("Student record is successfully deleted..");
	}

}
