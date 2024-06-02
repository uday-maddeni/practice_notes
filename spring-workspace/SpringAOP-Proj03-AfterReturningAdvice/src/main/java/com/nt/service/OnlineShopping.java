package com.nt.service;

import org.springframework.stereotype.Service;

@Service("onlineShopping")
public class OnlineShopping {
	public double shopping(String[] items, double[] prices) {
		double totalbill = 0.0;
		if(items != null) {
			for(double price : prices) {
				totalbill += price;
			}
		}
		return totalbill;
	}
}
