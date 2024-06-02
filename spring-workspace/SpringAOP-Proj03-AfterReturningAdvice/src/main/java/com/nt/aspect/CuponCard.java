package com.nt.aspect;

import java.io.FileWriter;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("cupon")
public class CuponCard {
	
	@AfterReturning(value="execution(* com.nt.service.OnlineShopping.shopping(..))", returning="billamt")
	public void cupon(JoinPoint jp, double billamt)throws Exception {
		System.out.println("after advice is applied on "+jp.getSignature()+" with args "+Arrays.deepToString(jp.getArgs()));
		String cuponmsg = null;
		if(billamt > 50000)cuponmsg = "available 40% discount on next purchase";
		else if(billamt > 30000)cuponmsg = "available 30% discount on next purchase";
		else if(billamt > 15000)cuponmsg = "available 15% discount on next purchase ";
		else cuponmsg = "available 5% discount on next purchase";
		
		FileWriter fw = new FileWriter("E:/cupon.txt");
		fw.write(cuponmsg);
		fw.flush();
		fw.close();
	}
}
