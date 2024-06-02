package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VoteEligibilityCheckService;

public class DeclarativeTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		VoteEligibilityCheckService service = ctx.getBean("voter", VoteEligibilityCheckService.class);
		
		System.out.println(service.checkVoteEligibility());
		
		ctx.close();
	}

}
