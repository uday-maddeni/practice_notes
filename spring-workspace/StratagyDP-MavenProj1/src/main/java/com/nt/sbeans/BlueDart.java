package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bdart")
public final class BlueDart {
	public String delivery(int oid) {
		return oid+" orderid order is assigned to BlueDart for delivery";
	}
}
