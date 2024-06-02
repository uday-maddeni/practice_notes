package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pinfo")
public final class PersonInfo {
	
	@Value("${person.name}")
	private String name;
	
	@Value("${person.age}")
	private int age;
	
	@Value("${person.address}")
	private String address;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private float osVersion;
	
	@Value("${Path}")
	private String pathData;
	
	@Override
	public String toString() {
		return "Person Info [ name :"+name+", age :"+age+", address :"+address+", osName :"+osName+", osVersion :"+osVersion+", path :"+pathData+" ]";
	}
}
