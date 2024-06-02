package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AspectAOPAroundAdviceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		BankService proxy = ctx.getBean("bankService", BankService.class);
		
		System.out.println(proxy.getClass()+"--------"+proxy.getClass().getSuperclass());
		
		System.out.println("simple interest :"+proxy.calculateSimpleInterest(100000, 2, 12));
		
		System.out.println("Coumpound interest :"+proxy.calculateCompoundInterest(100000, 2, 12));
		
		ctx.close();
	}

}
