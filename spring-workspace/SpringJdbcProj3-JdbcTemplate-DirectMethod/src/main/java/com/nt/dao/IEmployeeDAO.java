package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDAO {
	//public List<Map<String, Object>> getEmployeesByDesg(String desg1, String desg2);
	public List<Map<String, Object>> getEmployeesByDesg(String desg1);
}