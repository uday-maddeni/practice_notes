package com.nt.test;

import java.util.Arrays;

public class ClassPropertyTest {

	public static void main(String[] args) {
		
		Class c1=java.util.Date.class;   //c1 is the reference variable pointing to java.lang.Class object
		                                 //and containing java.util.Date and its details as the data of the object
		/*
		System.out.println("c1 object class name:"+c1.getClass());
		System.out.println("c1 object data "+c1.toString());
		System.out.println("c1 object (data class) implemented interfaces :"+Arrays.toString(c1.getInterfaces()));
		System.out.println("c1 object (data class) super class :"+c1.getSuperclass());
		System.out.println("c1 object (data class) methods :"+Arrays.toString(c1.getMethods()));
		*/
		
		Class c2=java.lang.String.class;//c2 is the object reference of java.lang.Class object and 
		                                //having java.lang.String and its details as the data of the object.
		
		System.out.println("c2 object class name :"+c2.getClass());//gives us c2 object classname
		System.out.println("c2 object (String class) implemented interfaces :"+Arrays.toString(c2.getInterfaces()));
		System.out.println("c2 object (String class) super class name :"+c2.getSuperclass());
		System.out.println("c2 object (String class) methods :"+Arrays.toString(c2.getMethods()));
	}

}
