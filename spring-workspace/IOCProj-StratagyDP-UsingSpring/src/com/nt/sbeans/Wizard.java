package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("wz")
public final class Wizard implements Courier {
	
	public Wizard() {
		System.out.println("Wizard 0 param constructor");
	}
	
	public String deliver(int oid) {
		return oid+" orderid order is assigned to Wizard for delivery";
	}

}
