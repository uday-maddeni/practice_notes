package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository("empLoginDAO")
public final class EmployeeLoginDAOImpl implements IEmployeeLoginDAO {
	
	@Autowired
	private SimpleJdbcCall sjc;
	
	public String authenticate(String username, String password) {
		sjc.setProcedureName("Auth_pro");
		Map<String, Object> map = new HashMap<>();
		map.put("user", username);
		map.put("pass", password);
		
		Map<String, Object> outParam = sjc.execute(map);
		
		String result = (String) outParam.get("RESULT");
		
		return result;
	}
}
