package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnlineShopping;

public class AfterReturningTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		OnlineShopping proxy = ctx.getBean("onlineShopping", OnlineShopping.class);
		//new String[]{"laptop","mobile","watch","ipad"}
		double bill = proxy.shopping(new String[]{"laptop","mobile","watch","ipad"} , new double[]{5000.0, 3600.0, 1000.0, 2500.0});
		System.out.println(bill);
		ctx.close();
	}

}
