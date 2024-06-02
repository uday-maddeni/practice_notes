package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	
	
	private static final String GET_EMP_SAL_BY_NO = "SELECT SAL FROM EMP WHERE EMPNO = ?";
	
	@Autowired
	private JdbcTemplate jt;
	
	public double getEmpSalByNo(int empno) {
		double sal = jt.queryForObject(GET_EMP_SAL_BY_NO, double.class, empno);
		return sal;
	}
}
