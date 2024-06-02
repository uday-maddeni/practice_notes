package com.nt.dao;

public interface IEmployeeDAO {
	public int insertEmployeeRecord(int empno, String empname, String job, double sal, int deptno);
	
	public int updateEmployeeRecord(double percentage, String ename);
	
	public int deleteEmployeeRecord(int startEmpNo, int endEmpNO);
}
