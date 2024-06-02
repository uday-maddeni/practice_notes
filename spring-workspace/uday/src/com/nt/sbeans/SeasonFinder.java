package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	
	private LocalDate date;
	
	/*
	 * @Autowired 
	 * public void setDate(LocalDate date) { 
	 *       this.date=date;
	 * }
	 */
	
	@Autowired
	public void profile(LocalDate date) {
		this.date=date;
	}
	
	public String findSeason() {
		int month=date.getMonthValue();
		System.out.println(month);
		if(month>=3 && month<=6)return "Summer Season";
		else if(month<=7 && month>=10)return "Rainy Season";
		else return "Winter Season";
	}
	
}
