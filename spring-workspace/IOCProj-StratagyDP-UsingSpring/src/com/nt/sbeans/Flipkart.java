package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart 0 param constructor");
	}
	
	
	public String shopping(String items[],float prices[]) {
		System.out.println("Flipkart shopping(-,-)");
		float billAmt=0.0f;
		for(float p:prices) {
			billAmt=billAmt+p;
		}
		int oid=new Random().nextInt(10000);
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+" are ordered with prices "+Arrays.toString(prices)+" having billamount "+billAmt+"----"+msg;
	}
	
}
