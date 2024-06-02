package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VoteEligibleChechService;

public class ProgramaticTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		VoteEligibleChechService service = ctx.getBean("vote", VoteEligibleChechService.class);
		
		System.out.println(service.voteEligibilityCheck());
		
		ctx.close();
	}

}
