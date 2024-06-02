package com.nt.aspect;

import java.util.Scanner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("preTest")
public class PreTesting {
	
	@Before(value="execution(* com.nt.service.ShowRoom.purchase(..))")
	public void testDrive(JoinPoint jp)throws Throwable{
		System.out.println("PreTesting.testDrive()");
		Object[] args = jp.getArgs();
		System.out.println(args[0]+" car is ready for testDrive and price is "+args[1]);
		System.out.println("Did you like the car (true/false) :");
		Scanner sc = new Scanner(System.in);
		boolean feedback = sc.nextBoolean();
		if(!feedback) {
			throw new IllegalArgumentException(args[0]+" car is failed in testDrive");
		}
		sc.close();
	}
}
