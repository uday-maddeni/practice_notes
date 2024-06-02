package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		ShoppingStore proxy = ctx.getBean("shoppingStore", ShoppingStore.class);
		
		double billamt1 = proxy.generateBill(new String[]{"laptop","mobile","watch","ipad"} , new double[]{5000.0, 3600.0, 1000.0, 2500.0});
		System.out.println("bill amount "+billamt1);
		
		double billamt2 = proxy.generateBill(new String[] {} , new double[]{});
		System.out.println(billamt2);
		
		
		ctx.close();
	}

}
