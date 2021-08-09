package com.myapp.ems.sql.queries;

import com.myapp.ems.model.Employee;

public class EmployeeQueryBuilder {

	public static String EMS_QUERY_UDATE_EMPLOYEE_BY_ID = "update employees set email_id = :email_id where id = :id";
	
	public String updateEmployeeQuery(Employee emp) {
		String QUERY_UPDATE = "";
		if(emp!=null) {
			if(emp.getFirstName().isEmpty()) {
				
			}
		}

		return QUERY_UPDATE;
	}
}
