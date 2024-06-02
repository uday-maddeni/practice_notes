package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationController {
	
	
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	
	
	@GetMapping("/register")
	public String showRegisterPage(@ModelAttribute("std") Student st) {
		System.out.println("Student details are : "+st);
		return "registerpage";
	}
	
	@PostMapping("/register")
	public String showResultPage(@ModelAttribute("std") Student st, Map<String, Object> map) {
		System.out.println("Student form details :"+st);
		
		String result = null;
		if(st.getAvg() < 35)result = "fail";
		else result = "pass";
		
		map.put("res",result);
		map.put("student",st);
		
		return "resultpage";
	}
	
}
