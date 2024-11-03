package com.nareshit.dao;

import java.util.List;

import com.nareshit.model.Student;

public interface StudentDao {
	List<Student> getAllStudents();
	void saveStudent(Student st);
	void updateStudent(Student st);
	void deleteStudent(Integer stuId);
	Student getStudent(Integer stuId);
}
