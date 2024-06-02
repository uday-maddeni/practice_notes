package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;

@Service("empService")
public final class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO empDAO;
	
	public String doEmployeeRecordInserted(int empno, String empname, String job, double sal, int deptno) {
		int count = empDAO.insertEmployeeRecord(empno, empname, job, sal, deptno);
		return count == 0 ? "Employee record not inserted" : "Employee record inserted";
	}
	
	public String doEmployeeRecordUpdated(double percentage, String ename) {
		int count = empDAO.updateEmployeeRecord(percentage, ename);
		return count == 0 ? "Employee sal is not updated" : "Employee sal is updated";
	}
	
	public int doEmployeeRecordsDeleted(int startEmpNo, int endEmpNo) {
		int count = empDAO.deleteEmployeeRecord(startEmpNo, endEmpNo);
		return count;
	}
}
