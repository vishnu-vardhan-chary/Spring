package com.nareshit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.dao.StudentDao;
import com.nareshit.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;
	
	
	@RequestMapping("/showStudentPage")
	public String showStudentPage() {
		return "add_student";
	}
	
	@RequestMapping("/getAllStudents")
	public String getAllStudents(Model model) {
		List<Student> students = studentDao.getAllStudents();
		model.addAttribute("students", students);
		return "show_students";
	}
	
	@RequestMapping("/saveStudent")
	public String saveStudent(HttpServletRequest request) {
		String firstNamne = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		Student st = new Student(firstNamne, lastName);
		studentDao.saveStudent(st);
		return "redirect:/getAllStudents";
	}
	
	
	@RequestMapping("/updateStudent")
	public String updateStudent(HttpServletRequest request) {
		String stuId = request.getParameter("stu_id");
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		Student st = new Student(Integer.valueOf(stuId),firstName, lastName);
		studentDao.updateStudent(st);
		return "redirect:/getAllStudents";
	}
	@RequestMapping("/deleteStudent")
	public String deleteStudent(HttpServletRequest request) {
		String stuId = request.getParameter("stu_id");
		studentDao.deleteStudent(Integer.valueOf(stuId));
		return "redirect:/getAllStudents";
	}
	
	@RequestMapping("/editStudent")
	public String editStudent(HttpServletRequest request, Model model) {
		String stuId = request.getParameter("stu_id");
		Student st = studentDao.getStudent(Integer.valueOf(stuId));
		model.addAttribute("st", st);
		return "update_student";
	}
	
	
	
	
	
	
	
	
	
	
}
