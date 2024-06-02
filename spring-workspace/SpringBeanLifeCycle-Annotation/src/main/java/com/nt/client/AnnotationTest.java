package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VoteEligibilityCheckService;

public class AnnotationTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		VoteEligibilityCheckService vecs = ctx.getBean("voter", VoteEligibilityCheckService.class);
		
		System.out.println(vecs.checkVoteEligibility());
		
		ctx.close();
	}

}
