package com.nt.service;

public interface IEmployeeMgmtService {
	public String doEmployeeRecordInserted(int empno, String empname, String job, double sal, int deptno);
	
	public String doEmployeeRecordUpdated(double percentage, String ename);
	
	public int doEmployeeRecordsDeleted(int startEmpNo, int endEmpNo);
}
