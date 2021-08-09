package com.myapp.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.myapp.ems.model.Employee;

public interface EmployeeDao{
	
	public long count();
	
	public List<String> getEmployeeNames();
	
	public List<Employee> selectAllEmployees();
	
	public Employee selectEmployeeById(Long id);
	
	public int createEmployee(Employee employee);
	
	public int updateEmployee(Employee employee);
	
	public int deleteEmployee(Employee employee);
	

}
