package com.nt.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateDirectMethodTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		//List<Map<String, Object>> list = service.fetchEmployeesByDesg("CLERK", "MANAGER");
		
		List<Map<String, Object>> list = service.fetchEmployeesByDesg("CLERK");
		
//		list.forEach( map -> {
//			System.out.println(map);
//		});
		
		list.forEach(System.out::println);
		
		ctx.close();
	}

}
