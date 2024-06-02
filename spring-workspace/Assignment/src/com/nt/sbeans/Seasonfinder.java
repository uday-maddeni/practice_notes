package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class Seasonfinder {

	private LocalDate date;
	
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("Seasonfinder.setDate()");
		this.date=date;
	}
	
	public String findSeason() {
		int month=date.getMonthValue();
		if(month>=3 && month<=6)return "summer season";
		else if(month>=7 && month<=10)return "rainy season";
		else return "winter season";
	}
}
