package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeLoginMgmtService;

public class SpringJdbcCallMethodTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeLoginMgmtService service = ctx.getBean("empLoginService", IEmployeeLoginMgmtService.class);
		
		String result = service.validateUser("Karnan", "karnan123");
		
		System.out.println(result);
		
		ctx.close();
	}

}
