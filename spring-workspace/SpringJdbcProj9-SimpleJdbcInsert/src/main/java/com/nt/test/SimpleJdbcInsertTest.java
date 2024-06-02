package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class SimpleJdbcInsertTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		Employee e = new Employee();
		e.setEmpno(6778);
		e.setEname("Mani");
		e.setJob("Manager");
		e.setSal(10000.0f);
		e.setDeptno(30);
		
		String msg = service.putRecord(e);
		System.out.println(msg);
		
		ctx.close();
		
	}
}
