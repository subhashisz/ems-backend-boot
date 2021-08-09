package com.myapp.ems.sql;

public interface EMSQueryHandler {

	public static String EMS_QUERY_COUNT_NO_OF_RECORDS = "select count(*) from employees";

	// EMPLOYEE TABLE QUERIES
	public static String EMS_QUERY_SELECT_EMPLOYEE_NAMES = "SELECT first_name FROM EMPLOYEEs";
	public static String EMS_QUERY_CREATE_EMPLOYEE = "select * from employee_management_system.employees";
	public static String EMS_QUERY_SELECT_ALL_EMPLOYEE = "select id,first_name,last_name,email_id from employee_management_system.employees";
	public static String EMS_QUERY_DELETE_EMPLOYEE_BY_ID = "SELECT * FROM EMPLOYEE";
	public static String EMS_QUERY_UDATE_EMPLOYEE_BY_ID = "update employees set email_id = :email_id where id = :id";
	public static String EMS_QUERY_SELECT_EMPLOYEE_BY_ID = "select id,first_name,last_name,email_id from employees where id=:id";

	// ADDRESS TABLE QUERIES
	public static String EMS_QUERY_CREATE_ADDRESS = "SELECT * FROM EMPLOYEE";
	public static String EMS_QUERY_SELECT_ADDRESS_FOR_EMPLOYEE = "SELECT * FROM EMPLOYEE";
	public static String EMS_QUERY_DELETE_ADDRESS_OF_EMPLOYEE_BY_ID = "SELECT * FROM EMPLOYEE";
	public static String EMS_QUERY_INSERT_ADDRESS = "SELECT * FROM EMPLOYEE";
}
