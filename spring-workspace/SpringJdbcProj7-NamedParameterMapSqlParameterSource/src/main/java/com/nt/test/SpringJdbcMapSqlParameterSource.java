package com.nt.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

public class SpringJdbcMapSqlParameterSource {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		List<Employee> list = service.fetchEmpsByDesg("MANAGER", "CLERK");
		
		//list.forEach(System.out::println);
		
		list.forEach(employee -> {
			System.out.println(employee);
		});
		
		ctx.close();
	}

}
