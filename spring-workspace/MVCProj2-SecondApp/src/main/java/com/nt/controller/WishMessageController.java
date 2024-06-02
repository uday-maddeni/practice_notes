package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageController {
	
	@Autowired
	IWishMessageService service;
	
	@RequestMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	
	
	@RequestMapping("/wish")
	public String showWishMessage(Map<String, Object> map) {
		
		String str = service.wishMessage();
		
		map.put("wmsg", str);
		
		return "show_wishmsg";
	}
	
}
