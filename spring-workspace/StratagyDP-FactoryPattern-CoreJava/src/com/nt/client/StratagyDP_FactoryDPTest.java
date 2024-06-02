package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratagyDP_FactoryDPTest {

	public static void main(String[] args) {
		
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		
		String result=fpkt.shopping(new String[] {"shirt","trouser","shoes"}, new float[] {3000.0f,5000.0f,2000.0f});
		
		System.out.println(result);

	}

}
