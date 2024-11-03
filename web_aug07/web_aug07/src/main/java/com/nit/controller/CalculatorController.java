package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CalculatorController {

	@RequestMapping("/showCalculator")
	public String showCalculator() {
		return "calculator";
	}
	
	
	@RequestMapping("/calculate")
	public String calculate(HttpServletRequest request, Model model) {
		String firstValue = request.getParameter("first_value");
		String secondValue = request.getParameter("second_value");
		String optionValue = request.getParameter("option");
		double d1 = Double.parseDouble(firstValue);
		double d2 = Double.parseDouble(secondValue);
		double result = 0;
		switch (optionValue) {
			case "1": {result = d1+d2;break;}
			case "2": {result = d1-d2;break;}	
			case "3": {result = d1*d2;break;}
			case "4": {result = d1/d2;break;}
		}
		model.addAttribute("output", result);
		
		return "result";
	}
	
	
	
	
	
	
	
	
	
	
	
}
