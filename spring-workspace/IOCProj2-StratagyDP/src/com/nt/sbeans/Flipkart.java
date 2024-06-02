package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	
	@Autowired
	@Qualifier("cr")
	private Courier courier;
	
//	public Flipkart(Courier courier) {
//		this.courier = courier;
//	}
	
	public String shopping(String[] items, float[] prices) {
		float billamt = 0.0f;
		for(float price : prices) {
			billamt += price;
		}
		
		int oid = new Random().nextInt(10000);
		
		String msg = courier.delivery(oid);
		
		return Arrays.toString(items)+" items are ordered with prices "+Arrays.toString(prices)+" with billamount "+billamt+" and "+msg;
	}
	
	
}
