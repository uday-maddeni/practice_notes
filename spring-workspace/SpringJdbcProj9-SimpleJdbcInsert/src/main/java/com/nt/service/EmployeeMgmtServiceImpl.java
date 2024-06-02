package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public final class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO empDAO;
	
	public String putRecord(Employee emp) {
		int cnt = empDAO.insertRecord(emp);
		return cnt == 0 ? "Emp record not inserted" : "Emp record inserted";
	}
}
