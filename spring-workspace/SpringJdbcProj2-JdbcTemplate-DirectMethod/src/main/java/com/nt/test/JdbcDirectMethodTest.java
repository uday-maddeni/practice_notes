package com.nt.test;

import java.util.Map;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class JdbcDirectMethodTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		System.out.println("Enter Employee EMPNO :");
		Map<String, Object> map = service.fetchEmpRecord(sc.nextInt());
		
		System.out.println(map);
		
		ctx.close();
		sc.close();
	}

}
