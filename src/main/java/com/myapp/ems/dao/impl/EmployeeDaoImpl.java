package com.myapp.ems.dao.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.ems.dao.EmployeeDao;
import com.myapp.ems.mapper.EmployeeRowMapper;
import com.myapp.ems.model.Employee;


import static com.myapp.ems.sql.EMSQueryHandler.EMS_QUERY_CREATE_EMPLOYEE;
import static com.myapp.ems.sql.EMSQueryHandler.EMS_QUERY_DELETE_EMPLOYEE_BY_ID;
import static com.myapp.ems.sql.EMSQueryHandler.EMS_QUERY_SELECT_ALL_EMPLOYEE;
import static com.myapp.ems.sql.EMSQueryHandler.EMS_QUERY_SELECT_EMPLOYEE_BY_ID;
import static com.myapp.ems.sql.EMSQueryHandler.EMS_QUERY_SELECT_EMPLOYEE_NAMES;
import static com.myapp.ems.sql.EMSQueryHandler.EMS_QUERY_UDATE_EMPLOYEE_BY_ID;
import static com.myapp.ems.sql.EMSQueryHandler.EMS_QUERY_COUNT_NO_OF_RECORDS;

@Repository
//@Log4j2
public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger log = LoggerFactory.getLogger(EmployeeDaoImpl.class);
	
	/*
	 * log.trace("A TRACE Message"); log.debug("A DEBUG Message");
	 * log.info("An INFO Message"); log.warn("A WARN Message");
	 * log.error("An ERROR Message");
	 */

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public long count() {
		return 0;
	}

	@Override
	public List<String> getEmployeeNames() {
		return null;
	}

	// @RequestMapping("/lombok")
	@Override
	public List<Employee> selectAllEmployees() {
		return this.namedParameterJdbcTemplate.query(EMS_QUERY_SELECT_ALL_EMPLOYEE, new EmployeeRowMapper());
	}

	@Override
	public Employee selectEmployeeById(Long id) {
		return this.namedParameterJdbcTemplate.queryForObject(EMS_QUERY_SELECT_EMPLOYEE_BY_ID,
				new MapSqlParameterSource("id", id), new EmployeeRowMapper());
	}

	// ********************************
	@Override
	public int createEmployee(Employee employee) {
		return namedParameterJdbcTemplate.update("update employees set email_id = :email_id where id = :id",
				new BeanPropertySqlParameterSource(employee));
	}

	@Override
	public int updateEmployee(Employee employee) {
		return namedParameterJdbcTemplate.update("update employees set email_id = :email_id where id = :id",
				new BeanPropertySqlParameterSource(employee));
	}

	@Override
	public int deleteEmployee(Employee employee) {
		return namedParameterJdbcTemplate.update("update employees set email_id = :email_id where id = :id",
				new BeanPropertySqlParameterSource(employee));
	}

}
