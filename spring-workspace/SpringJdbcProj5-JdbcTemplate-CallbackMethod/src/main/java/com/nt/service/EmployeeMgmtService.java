package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public final class EmployeeMgmtService implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO empDAO;
	
	public Employee fetchEmployeeByNo(int empno) {
		Employee emp = empDAO.getEmployeeByNo(empno);
		return emp;
	}
}
