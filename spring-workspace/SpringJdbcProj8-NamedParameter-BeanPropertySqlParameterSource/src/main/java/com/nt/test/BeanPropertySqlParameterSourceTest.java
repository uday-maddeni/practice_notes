package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class BeanPropertySqlParameterSourceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		Employee emp = new Employee();
		emp.setEmpno(7676);
		emp.setEname("Utkarsh");
		emp.setJob("Manager");
		emp.setSal(10000.0f);
		emp.setDeptno(10);
		
		String msg = service.noOfEmpsInserted(emp);
		
		System.out.println(msg);
		
		ctx.close();
	}

}
