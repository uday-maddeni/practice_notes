package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateCallbackMethodTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		Employee emp = service.fetchEmployeeByNo(7934);
		
		System.out.println(emp);
		
		ctx.close();
	}

}
