package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class IEmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	private JdbcTemplate jt;
	
	private static final String GET_EMPS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMPS";
	private static final String INSERT_EMP = "INSERT INTO EMPS (EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES (?,?,?,?,?)";
	private static final String GET_EMPS_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMPS WHERE EMPNO=?";
	private static final String UPDATE_EMP = "UPDATE EMPS SET ENAME=?, JOB=?, SAL=?, DEPTNO=? WHERE EMPNO=?";
	private static final String DELETE_EMP = "DELETE FROM EMPS WHERE EMPNO=?";
	
	public List<Employee> getAllEmpsRecords(){
		List<Employee> empList;
		
		empList = jt.query(GET_EMPS, 
				rs->{
					List<Employee> list = new ArrayList<>();
					while(rs.next()) {
						Employee emp = new Employee();
						emp.setEmpno(rs.getInt(1));
						emp.setEname(rs.getString(2));
						emp.setJob(rs.getString(3));
						emp.setSal(rs.getFloat(4));
						emp.setDeptno(rs.getInt(5));
						
						list.add(emp);
					}
					return list;
				});
		return empList;
	}
	
	
	public int insertEmpRecord(Employee emp) {
		int cnt = jt.update(INSERT_EMP,emp.getEmpno(),emp.getEname(),emp.getJob(),emp.getSal(),emp.getDeptno());
		return cnt;
	}
	
	
	public Employee getEmpByNo(int no) {
		Employee emp = jt.queryForObject(GET_EMPS_BY_NO, (rs,rowNo)->{
			Employee e = new Employee();
			e.setEmpno(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setJob(rs.getString(3));
			e.setSal(rs.getFloat(4));
			e.setDeptno(rs.getInt(5));
			return e;
		}, no);
		return emp;
	}


	public int updateEmpNoRecord(Employee emp) {
		int cnt = jt.update(UPDATE_EMP,emp.getEname(),emp.getJob(),emp.getSal(),emp.getDeptno(),emp.getEmpno());
		return cnt;
	}
	
	public int deleteEmpNoRecord(int empno) {
		int cnt = jt.update(DELETE_EMP, empno);
		return cnt;
	}
}
