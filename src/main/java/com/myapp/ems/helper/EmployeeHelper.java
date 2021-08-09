package com.myapp.ems.helper;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myapp.ems.dao.EmployeeDao;
import com.myapp.ems.model.Employee;

@Component
public class EmployeeHelper {

	private static final Logger log = LoggerFactory.getLogger(EmployeeHelper.class);

	/*
	 * @Autowired private EmployeeJPARepository employeeRepository;
	 */

	@Autowired
	private EmployeeDao employeeRepository;

	public List<String> getEmployeeNames() {
		return employeeRepository.getEmployeeNames();
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.selectAllEmployees();
	}

	/*
	 * public Employee createEmployee() { return
	 * jdbcEmployeeRepository.createEmployee(); }
	 */

	/*
	 * public ResponseEntity<Employee> getEmployeeById(Long id) { Employee employee
	 * = employeeRepository.getEmployeeById(id); return ResponseEntity.ok(employee);
	 * }
	 */
}
