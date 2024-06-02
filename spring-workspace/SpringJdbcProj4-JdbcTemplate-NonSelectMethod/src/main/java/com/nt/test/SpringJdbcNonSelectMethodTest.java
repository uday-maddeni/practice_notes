package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class SpringJdbcNonSelectMethodTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		//String msg = service.doEmployeeRecordInserted(7777, "Mansoor", "Manager", 56000.0, 10);
		
		//String msg = service.doEmployeeRecordUpdated(0.5, "MILLER");
		
		//System.out.println(msg);
		
		int result = service.doEmployeeRecordsDeleted(1, 10);
		
		System.out.println(result);
		
		ctx.close();
	}

}
