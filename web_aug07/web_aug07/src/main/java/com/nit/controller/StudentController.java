package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.dao.StudentDao;
import com.nit.model.Student;

@Controller
public class StudentController {

	@Autowired
	@Qualifier("dao")
	private StudentDao studentDao;
	
	@RequestMapping("/getAllStudents")
	public String getAllStudents(Model model) {
		List<Student> students = studentDao.getAllStudents();
		model.addAttribute("students", students);
		return "show_students";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
