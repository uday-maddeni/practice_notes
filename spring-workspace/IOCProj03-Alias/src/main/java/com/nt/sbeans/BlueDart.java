package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bdart")
public final class BlueDart {
	
	public String dilivery(int oid) {
		return oid+" orderid order is assigned for BlueDart form delivery";
	}
}
