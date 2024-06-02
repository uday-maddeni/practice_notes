package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMPS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (:desg1, :desg2) ORDER BY JOB";
	
	@Autowired
	private NamedParameterJdbcTemplate njt;
	
	
	public List<Employee> getEmpsByDesg(String desg1, String desg2){
		
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("desg1", desg1);
		map.addValue("desg2", desg2);
		
		List<Employee> list = njt.query(GET_EMPS_BY_DESG, map, 
				rs ->{
					List<Employee> ans = new ArrayList<>();
					while(rs.next()) {
						Employee emp = new Employee();
						emp.setEmpno(rs.getInt(1));
						emp.setEname(rs.getNString(2));
						emp.setJob(rs.getNString(3));
						emp.setSal(rs.getFloat(4));
						emp.setDeptno(rs.getInt(5));
						ans.add(emp);
					}
					return ans;
				});
		
		return list;
	}
}
