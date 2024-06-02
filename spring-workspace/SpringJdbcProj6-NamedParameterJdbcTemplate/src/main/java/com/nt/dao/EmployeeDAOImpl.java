package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public final class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMPS_BY_SAL_RANGE =  "SELECT COUNT(*) FROM EMP WHERE SAL>=:min AND SAL<=:max";
	
	@Autowired
	private NamedParameterJdbcTemplate njt;
	
	public int getEmpsBySalRange(float start, float end) {
		Map<String, Object> paramsMap = new HashMap<>();
		paramsMap.put("min", start);
		paramsMap.put("max", end);
		int cnt = njt.queryForObject(GET_EMPS_BY_SAL_RANGE, paramsMap, Integer.class);
		return cnt;
	}
}
