package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart 0 param constructor");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart setCourier() setter method");
		this.courier=courier;
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
