package com.nt.sbeans;

import java.util.Date;

public class VoteEligibilityCheckService {
	
	private String name;
	private int age;
	private String addr;
	private Date dov;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String checkVoteEligibility() {
		if(name != null && age >= 18) {
			return "mr/miss/mrs."+name+" you are eligibility to vote on date "+dov+" at "+addr+" pollingbooth";
		} else {
			return "mr/miss/mrs."+name+" you are not eligibility to vote";
		}
	}
	
	public void myInit() {
		dov = new Date();
		if(name == null || age < 0)throw new IllegalArgumentException("Invalid inputs , check the inputs");
	}
	
	public void myDestroy() {
		name = null;
		age = 0;
		addr = null;
		dov = null;
	}
	
}
