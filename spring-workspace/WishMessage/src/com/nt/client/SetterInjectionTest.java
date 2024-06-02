package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Object obj = ctx.getBean("wmg");
		
		WishMessageGenerator generator =(WishMessageGenerator)obj;
		String result = generator.generateWishMessage("Karnan");
		System.out.println(result);
		System.out.println(generator.findSeason());
		
		ctx.close();
	}

}
