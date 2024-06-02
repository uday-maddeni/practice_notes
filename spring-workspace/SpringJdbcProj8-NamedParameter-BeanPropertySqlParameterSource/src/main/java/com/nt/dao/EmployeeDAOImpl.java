package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String EMP_RECORD = "INSERT INTO EMP (EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES (:empno, :ename, :job, :sal, :deptno)";
	
	@Autowired
	private NamedParameterJdbcTemplate njt;
	
	public int insertEmpRecord(Employee emp) {
		
		BeanPropertySqlParameterSource bpsps = new BeanPropertySqlParameterSource(emp);
		
		int cnt = njt.update(EMP_RECORD, bpsps);
		return cnt;
	}
	
}
