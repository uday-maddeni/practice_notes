package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonInfo;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		PersonInfo person = ctx.getBean("pinfo", PersonInfo.class);
		
		System.out.println(person);
		
		ctx.close();
		
		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");
		
		System.out.println("System properties are :"+ System.getProperties());
	}

}
