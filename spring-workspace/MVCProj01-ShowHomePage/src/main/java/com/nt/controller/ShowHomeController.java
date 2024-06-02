package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	/*
	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("ShowHomeController.showHomePage()");
		return "uday";
	}
	
	@RequestMapping("/")
	public String showHomePage(Map<String , Object> map) {
		System.out.println("ShowHomeController.showHomePage() model class is :"+map.getClass());
		map.put("attr1","val1");
		map.put("Sysdate",new Date());
		map.put("age",21);
		
		return "uday";
	}
	
	*/
	
	@RequestMapping("/")
	public String showHomePage(Model m) {
		System.out.println("ShowHomeController.showHomePage() model class is :"+m.getClass());
		m.addAttribute("attr1","val1");
		m.addAttribute("Sysdate",new Date());
		m.addAttribute("age",21);
		
		return "uday";
	}
	
}
