package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements Courier{
	public BlueDart() {
		System.out.println("BlueDart-0 param constructor");
	}
	
	public String deliver(int oid) {
		
		return oid+" orderid order is assigned to BlueDart for delivery";
	}
}
