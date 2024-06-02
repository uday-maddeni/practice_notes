package com.nt.aspect;

import java.io.FileWriter;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.nt.exception.InvalidInputsException;

@Aspect
@Component("grapher")
public class CommonExceptionLogger_Grapher {
	
	@AfterThrowing(value="execution(* com.nt.service.ShoppingStore.generateBill(..))", throwing="e")
	public void exceptionLoggerAndGrapher(JoinPoint jp, Exception e)throws Exception{
		String logmsg = e+" exception is raised in "+jp.getSignature()+" with args "+Arrays.deepToString(jp.getArgs());
		FileWriter fw = new FileWriter("E:/expLog.txt", true);
		fw.write(logmsg+"\n");
		fw.flush();
		fw.close();
		
		throw new InvalidInputsException(e.getMessage());
	}
}
