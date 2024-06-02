package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("pmAspect")
public class PerformanceMonitoringAspect {
	@Around(value = "execution(double com.nt.service.BankService.calculate*(..))")
	public Object performance(ProceedingJoinPoint pjp)throws Throwable{
		long start = System.currentTimeMillis();
		Object returnVal = pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs())+" has taken "+(end - start)+" milliseconds");
		return returnVal;
	}
}
