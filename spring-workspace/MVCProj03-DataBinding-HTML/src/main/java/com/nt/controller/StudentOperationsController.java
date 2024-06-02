package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	
	@GetMapping("/student")
	public String studentRegisterPage() {
		return "registerpage";
	}
	
	@PostMapping("/student")
	public String studentResultPage(@ModelAttribute("st") Student st, Map<String, Object> map) {
		
		System.out.println("Student form details are :"+st);
		
		String result = null;
		if(st.getAvg() < 35)result="fail";
		else result="pass";
		
		map.put("rs",result);
		map.put("s",st);
		
		return "resultpage";
	}
}
