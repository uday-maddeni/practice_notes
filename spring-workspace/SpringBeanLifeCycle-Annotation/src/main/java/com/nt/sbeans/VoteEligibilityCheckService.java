package com.nt.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class VoteEligibilityCheckService {
	@Value("${person.name}")
	private String name;
	
	@Value("${person.age}")
	private int age;
	
	@Value("${person.address}")
	private String address;
	
	private Date dov;
	
	public String checkVoteEligibility() {
		if(name != null && age > 17) {
			return name+" you are eligible to vote on "+dov+" at "+address+" center";
		} else {
			return name+" you are not eligible to vote";
		}
	}
	
	@PostConstruct
	public void myInit() {
		dov = new Date();
		if(name == null || age <= 0)throw new IllegalArgumentException("Invalid input values");
	}
	
	@PreDestroy
	public void myDestroy() {
		name = null;
		age = 0;
		address = null;
		dov = null;
	}
	
}
