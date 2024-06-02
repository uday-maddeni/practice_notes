package com.nt.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;

@Service("empService")
public final class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO empDAO;
	
	public Map<String, Object> fetchEmpRecord(int empno){
		Map<String, Object> map = empDAO.getEmpRecord(empno);
		return map;
	}
}
