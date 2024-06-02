package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationController {
	
	@GetMapping("/home")
	public String showHomePage(@RequestParam int no, @RequestParam(defaultValue="Uday") String name1[]
			                                       , @RequestParam("name1")List<String> name2
			                                       , @RequestParam("name1")Set<String> name3) {
		System.out.println(no+"----------"+Arrays.deepToString(name1)+"-------"+name2+"--------"+name3);
		return "welcome";
	}
	
}
