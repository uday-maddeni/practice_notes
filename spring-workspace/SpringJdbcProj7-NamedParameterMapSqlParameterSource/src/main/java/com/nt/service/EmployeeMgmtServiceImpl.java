package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public final class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO empDAO;
	
	public List<Employee> fetchEmpsByDesg(String desg1, String desg2){
		List<Employee> list = empDAO.getEmpsByDesg(desg1, desg2);
		return list;
	}
}
