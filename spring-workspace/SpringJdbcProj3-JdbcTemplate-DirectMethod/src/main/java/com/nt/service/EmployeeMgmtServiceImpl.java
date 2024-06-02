package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;

@Service("empService")
public final class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO eD;
	
//	public List<Map<String, Object>> fetchEmployeesByDesg(String desg1, String desg2){
//		List<Map<String, Object>> list = eD.getEmployeesByDesg(desg1, desg2);
//		return list;
//	}
	
	
	public List<Map<String, Object>> fetchEmployeesByDesg(String desg1){
		List<Map<String, Object>> list = eD.getEmployeesByDesg(desg1);
		return list;
	}
	
}
