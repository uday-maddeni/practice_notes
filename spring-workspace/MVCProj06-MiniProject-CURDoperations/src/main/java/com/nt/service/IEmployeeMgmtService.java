package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> fetchAllEmpsRecords();
	public String addEmpRecord(Employee emp);
	public Employee fetchEmpByNo(int empno);
	public String isRecordUpdated(Employee emp);
	public String removeEmpNoRecord(int empno);
}
