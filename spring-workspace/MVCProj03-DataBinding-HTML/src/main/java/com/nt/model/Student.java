package com.nt.model;

import lombok.Data;

@Data
public class Student {
	private int sid;
	private String sname;
	private String addr = "hyd";
	private float avg;
}
