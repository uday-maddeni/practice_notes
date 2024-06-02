package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationController {
	
	@Autowired
	IEmployeeMgmtService service;
	
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	
	@GetMapping("/emp_report")
	public String showAllEmpsRecords(Map<String, Object> map) {
		
		List<Employee> list = service.fetchAllEmpsRecords();
		
		map.put("empsList", list);
		
		return "show_records";
	}
	
	@GetMapping("/add_emp")
	public String addEmployeeRecord(@ModelAttribute("emp") Employee emp) {
		return "addemp";
	}
	
	@PostMapping("/add_emp")
	public String addEmployeeSubmission(@ModelAttribute("emp") Employee emp, Map<String, Object> map) {
		
		String msg = service.addEmpRecord(emp);
		List<Employee> list = service.fetchAllEmpsRecords();
		
		map.put("empsList",list);
		map.put("result",msg);
		
		return "redirect:emp_report";
	}
	
	@GetMapping("/emp_edit")
	public String showEditingFormPage(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp) {
		Employee emp1 = service.fetchEmpByNo(no);
		BeanUtils.copyProperties(emp1, emp);
		return "edit_form_page";
	}
	
	
	@PostMapping("/emp_edit")
	public String showEditingFormPageSubmission(@ModelAttribute("emp") Employee emp, Map<String, Object> map) {
		String msg = service.isRecordUpdated(emp);
		List<Employee> list = service.fetchAllEmpsRecords();
		
		map.put("empsList", list);
		map.put("result", msg);
		
		return "show_records";
		//return "redirect:emp_report";
	}
	
	@GetMapping("/emp_delete")
	public String deleteEmpRecord(@RequestParam("no") int no, Map<String, Object> map) {
		String msg = service.removeEmpNoRecord(no);
		List<Employee> list = service.fetchAllEmpsRecords();
		
		map.put("empsList", list);
		map.put("result", msg);
		
		return "show_records";
	}
	
	
}
