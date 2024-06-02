package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	
	  @Autowired
	  private LocalDateTime dateTime;
	  
	  @Autowired
	  private LocalDate date;
	  
	  
//	  
//	  @Autowired
//	  public WishMessageGenerator(LocalDateTime dateTime) {
//		  System.out.println("target class param-constructor");
//		  this.dateTime = dateTime;
//	  }
	 
	
//	@Autowired
//	public void setDateTime(LocalDateTime dateTime) {
//		System.out.println("WishMessage setDateTime()");
//		this.dateTime = dateTime;
//	}
	
	public String generateWishMessage(String user) {
		int hour = dateTime.getHour();
		if(hour < 12)return "Good Morning "+user;
		else if(hour < 16)return "Good Afternoon "+user;
		else if(hour < 20)return "Good Evening "+user;
		else return "Good Night "+user;
	}
	
	
	public String findSeason() {
		int month = date.getMonthValue();
		if(month >= 3 && month <= 6)return "This is Summer season";
		else if(month > 6 && month <= 10)return "This is Rainy season";
		else return "This is Winter season";
	}
	
}
