package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class AliasPropertyTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		Flipkart ft = ctx.getBean("fpkt", Flipkart.class);
		String result = ft.shopping(new String[] {"mobile, T.V, laptop, camara"}, new float[] {20000.0f, 30000.0f, 60000.0f, 80000.0f});
		System.out.println(result);
		ctx.close();
	}

}
