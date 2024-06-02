package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("vote")
public class VoteEligibleChechService implements InitializingBean,DisposableBean{
	
	@Value("${person.name}")
	private String name;
	@Value("${person.age}")
	private int age;
	@Value("${person.addr}")
	private String addr;

	private Date dov;
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public void setAddr(String addr) {
//		this.addr = addr;
//	}
	
	public String voteEligibilityCheck() {
		if(name != null && age > 17) {
			return name+" you are eligibile to vote on date "+dov+" at "+addr;
		} else {
			return name+" you are not eligible to vote";
		}
	}
	
	public void afterPropertiesSet() {
		if(name == null || age < 0)throw new  IllegalArgumentException("Invalid Inputs");
		dov = new Date();
	}
	
	public void destroy() {
		name = null;
		age = 0;
		addr = null;
		dov = null;
	}
}
