package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class SpringJdbcNamedParameterTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		int cnt = service.fetchEmpsBySalRange(2500.0f, 7000.0f);
		
		System.out.println("Employees b/w sal range are : "+cnt);
		
		ctx.close();
	}

}
