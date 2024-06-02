package com.nt.client;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class InjectionTest {

	public static void main(String[] args) {
		
		/*FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");   */
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		Object obj=ctx.getBean("sf");
		SeasonFinder sfind=(SeasonFinder)obj;   */
		
		//SeasonFinder sfind=(SeasonFinder)ctx.getBean("sf");
		
		
		//SeasonFinder sfind=(SeasonFinder)ctx.getBean("sf",SeasonFinder.class);
		
		/*Class<SeasonFinder> cc=SeasonFinder.class;
		SeasonFinder sfind=ctx.getBean("sf",cc);      */
		
		SeasonFinder sfind=ctx.getBean("sf",SeasonFinder.class);
		
		String result=sfind.findSeason();
		System.out.println(result);
		
		
		System.out.println("--------------------------------------");
		
		LocalDate ld=ctx.getBean("dt",LocalDate.class);
		System.out.println(ld);
		
		ctx.close();
	}

}
