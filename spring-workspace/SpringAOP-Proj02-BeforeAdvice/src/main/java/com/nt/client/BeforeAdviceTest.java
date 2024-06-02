package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShowRoom;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		ShowRoom proxy = ctx.getBean("showRoom", ShowRoom.class);
		
		System.out.println(proxy.getClass()+"================"+proxy.getClass().getSuperclass());
		
		String msg = proxy.purchase("RollsRoys", 100000, 2);
		
		System.out.println(msg);
		
		ctx.close();
	}

}
