package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getAllEmpsRecords();
	public int insertEmpRecord(Employee emp);
	public Employee getEmpByNo(int empno);
	public int updateEmpNoRecord(Employee emp);
	public int deleteEmpNoRecord(int empno);
}
