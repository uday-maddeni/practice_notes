package com.nt.service;

import org.springframework.stereotype.Service;

@Service("showRoom")
public class ShowRoom {
	public String purchase(String model, double price, double discount) {
		System.out.println("ShowRoom.purchase()");
		double finalPrice = price - (price * discount / 100);
		return model+" car is ordered with price "+price+" but after discount the price is :"+finalPrice;
	}
}
