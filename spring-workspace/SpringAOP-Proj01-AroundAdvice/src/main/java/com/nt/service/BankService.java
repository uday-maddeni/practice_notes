package com.nt.service;

import org.springframework.stereotype.Service;

@Service("bankService")
public class BankService {
	public double calculateSimpleInterest(double pamt, double rate, double time) {
		return (pamt * time * rate)/100;
	}
	
	public double calculateCompoundInterest(double pamt, double rate, double time) {
		return (pamt * Math.pow(1+(rate/100), time) - pamt);
	}
}
