package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class IEmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO empDAO;
	
	public List<Employee> fetchAllEmpsRecords(){
		List<Employee> empList;
		empList = empDAO.getAllEmpsRecords();
		return empList;
	}
	
	public String addEmpRecord(Employee emp) {
		int cnt = empDAO.insertEmpRecord(emp);
		return cnt == 0 ? "Emp record not inserted" : "Emp record inserted successfully";
	}
	
	public Employee fetchEmpByNo(int empno) {
		Employee emp = empDAO.getEmpByNo(empno);
		return emp;
	}
	
	
	public String isRecordUpdated(Employee emp) {
		int cnt = empDAO.updateEmpNoRecord(emp);
		return cnt == 0 ? "Emp record not updated" : "Emp record updated successfully";
	}
	
	public String removeEmpNoRecord(int empno) {
		int cnt = empDAO.deleteEmpNoRecord(empno);
		return cnt == 0 ? "Deletion failed" : "Emp record Deleted successfully";
	}
	
}
