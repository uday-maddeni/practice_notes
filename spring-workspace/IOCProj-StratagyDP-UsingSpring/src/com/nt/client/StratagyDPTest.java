package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StratagyDPTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Flipkart f=ctx.getBean("fpkt",Flipkart.class);
		
		String result=f.shopping(new String[] {"shirt","trouser","shoes"}, new float[] {3000.0f,5000.0f,4000.0f});
		
		System.out.println(result);
		
		ctx.close();
	}

}
