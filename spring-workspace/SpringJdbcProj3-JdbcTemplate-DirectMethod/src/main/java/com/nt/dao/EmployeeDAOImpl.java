package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	
	//private static final String GET_EMPS_BY_DESG = "SELECT * FROM EMP WHERE JOB IN (? , ?)";
	
	private static final String GET_EMPS_BY_DESG = "SELECT * FROM EMP WHERE JOB IN (?)";
	
	@Autowired
	private JdbcTemplate jt;
	
//	public List<Map<String, Object>> getEmployeesByDesg(String desg1, String desg2){
//		List<Map<String, Object>> list = jt.queryForList(GET_EMPS_BY_DESG, desg1, desg2);
//		return list;
//	}
	
	public List<Map<String, Object>> getEmployeesByDesg(String desg1){
		List<Map<String, Object>> list = jt.queryForList(GET_EMPS_BY_DESG, desg1);
		return list;
	}
	
}
