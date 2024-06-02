package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMP_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO = ?";
	
	@Autowired
	private JdbcTemplate jt;
	
	public Employee getEmployeeByNo(int empno) {
		Employee emp = jt.queryForObject(GET_EMP_BY_NO, new EmployeeRowMapper(), empno);
		return emp;
	}
	
	private static  class EmployeeRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getFloat(4));
			emp.setDeptno(rs.getInt(5));
			
			return emp;
		}
	}
	
	
}
