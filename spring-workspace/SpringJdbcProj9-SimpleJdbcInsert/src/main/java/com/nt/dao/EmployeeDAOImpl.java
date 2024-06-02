package com.nt.dao;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	private SimpleJdbcInsert sji;
	/*
	public int insertRecord(Employee emp) {
		sji.setTableName("emp");
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("empno", emp.getEmpno());
		paramMap.put("ename", emp.getEname());
		paramMap.put("job", emp.getJob());
		paramMap.put("sal", emp.getSal());
		paramMap.put("deptno", emp.getDeptno());
		
		int cnt = sji.execute(paramMap);
		return cnt;
	}
	*/
	
	/*
	public int insertRecord(Employee emp) {
		sji.setTableName("emp");
		MapSqlParameterSource msps = new MapSqlParameterSource();
		msps.addValue("empno", emp.getEmpno());
		msps.addValue("ename", emp.getEname());
		msps.addValue("job", emp.getJob());
		msps.addValue("sal", emp.getSal());
		msps.addValue("deptno", emp.getDeptno());
		
		int cnt = sji.execute(msps);
		return cnt;
	}
	*/
	
	public int insertRecord(Employee emp) {
		sji.setTableName("emp");
		
		BeanPropertySqlParameterSource bp = new BeanPropertySqlParameterSource(emp);
		int cnt = sji.execute(bp);
		return cnt;
	}
	
}
