package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Seasonfinder;

public class SeasonTester {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Object obj=ctx.getBean("sf");
		Seasonfinder x=(Seasonfinder)obj;
		
		String result=x.findSeason();
		System.out.println(result);
		
		ctx.close();

	}

}
