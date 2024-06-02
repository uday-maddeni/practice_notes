package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart getInstance(String courierName) {
		System.out.println("FlipkartFactory.getInstance()");
		
		Courier courier=null;
		if(courierName.equalsIgnoreCase("dtdc"))courier=new DTDC();
		else if(courierName.equalsIgnoreCase("bDart"))courier=new BlueDart();
		else
			throw new IllegalArgumentException("Invalid inputs");
		
		Flipkart fpkt=new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
