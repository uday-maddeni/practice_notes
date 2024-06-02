package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier {
	public String delivery(int oid) {
		return oid+" orderid order is assigned for DTDC for delivery";
	}
}
