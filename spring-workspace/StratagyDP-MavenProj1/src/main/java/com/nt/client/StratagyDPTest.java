package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StratagyDPTest {

	public static void main(String[] args) {
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		
		String result = fpkt.shopping(new String[] {"T-shirt, shirt, watch, shoes, mobile"}, new float[] {1000.0f, 2400.0f, 3450.0f, 1570.0f, 56000.0f});
		
		System.out.println(result);
		
		ctx.close();
	}

}
