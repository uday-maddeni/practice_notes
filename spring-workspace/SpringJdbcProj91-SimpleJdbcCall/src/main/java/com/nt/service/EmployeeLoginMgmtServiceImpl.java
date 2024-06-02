package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeLoginDAO;

@Service("empLoginService")
public final class EmployeeLoginMgmtServiceImpl implements IEmployeeLoginMgmtService {
	
	@Autowired
	private IEmployeeLoginDAO empDAO;
	
	public String validateUser(String username, String password) {
		String res = empDAO.authenticate(username, password);
		return res;
	}
}
