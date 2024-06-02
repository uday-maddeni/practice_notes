package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;

@Service("empService")
public final class EmployeeMgmtService implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO empDAO;
	
	public int fetchEmpsBySalRange(float start, float end) {
		int cnt = empDAO.getEmpsBySalRange(start, end);
		return cnt ;
	}
}
