package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public final class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO empDAO;
	
	public String noOfEmpsInserted(Employee emp) {
		int cnt = empDAO.insertEmpRecord(emp);
		return cnt == 0 ? "Employee record not inserted" : " Employee recored inserted" ;
	}
}
