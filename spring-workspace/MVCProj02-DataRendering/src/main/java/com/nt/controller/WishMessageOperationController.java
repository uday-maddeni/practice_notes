package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageOperationController {
	
	@Autowired
	private IWishMessageService wservice;
	
	@RequestMapping("/")
	public String showWishMessagePage() {
		return "welcome";
	}
	
	@RequestMapping("/wish")
	public String showWishMessage(Map<String,Object> map) {
		String resultmsg=wservice.generateWishMessage();
		
		map.put("resultmsg",resultmsg);
		
		return "show_result";
	}
	
	
	
}
