package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/addEmployee")
	public String addEmployee(Model model) {
		model.addAttribute(new Employee());
		return "add_employee";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@Validated Employee emp, BindingResult result, Model model) {
		if (result.hasErrors())
			return "add_employee";
		model.addAttribute("emp", emp);
		return "result";
	}
}
