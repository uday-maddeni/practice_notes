package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String EMP_RECORD = "INSERT INTO EMP (EMPNO, ENAME, JOB, SAL, DEPTNO) VALUES (? , ? , ? , ? , ?)";
	
	private static final String EMP_RECORD_TO_UPDATE = "UPDATE EMP SET SAL = SAL + SAL * ? WHERE ENAME = ?";
	
	private static final String EMP_RECORDS_DELETE_RANGE = "DELETE FROM EMP WHERE EMPNO >= ? AND EMPNO <= ?";
	
	@Autowired
	private JdbcTemplate jt;
	
	public int insertEmployeeRecord(int empno, String empname, String job, double sal, int deptno) {
		int count = jt.update(EMP_RECORD, empno, empname, job, sal, deptno);
		return count;
	}
	
	public int updateEmployeeRecord(double percentage, String ename) {
		int count = jt.update(EMP_RECORD_TO_UPDATE, percentage, ename);
		return count;
	}
	
	public int deleteEmployeeRecord(int startEmpNo, int endEmpNo) {
		int count = jt.update(EMP_RECORDS_DELETE_RANGE, startEmpNo, endEmpNo);
		return count;
	}
}
