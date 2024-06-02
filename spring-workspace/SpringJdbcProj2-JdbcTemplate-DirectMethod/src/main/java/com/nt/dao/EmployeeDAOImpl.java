package com.nt.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMP_BY_NO = "SELECT * FROM EMP WHERE EMPNO = ?";
	
	@Autowired
	private JdbcTemplate jt;
	
	public Map<String, Object> getEmpRecord(int empno){
		Map<String, Object> map = jt.queryForMap(GET_EMP_BY_NO, empno);
		return map;
	}
}
