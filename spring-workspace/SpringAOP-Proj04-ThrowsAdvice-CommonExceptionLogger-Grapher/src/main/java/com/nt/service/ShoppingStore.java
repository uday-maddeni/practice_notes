package com.nt.service;

import org.springframework.stereotype.Service;

@Service("shoppingStore")
public class ShoppingStore {
	public double generateBill(String[] items, double[] prices) {
		
		if(items == null || prices == null || items.length == 0 || prices.length == 0) {
			throw new IllegalArgumentException("Invalid input are given");
		}
		
		double totalbill = 0.0;
		for(double price : prices) {
			totalbill += price;
		}
		return totalbill;
	}
}
