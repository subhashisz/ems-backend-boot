package com.myapp.ems.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.myapp.ems.model.Address;
import com.myapp.ems.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student stu = new Student();
		
		stu.setId(rs.getLong("id"));
		stu.setFirstName(rs.getString("firstName"));
		stu.setLastName(rs.getString("lastName"));
		stu.setSex(rs.getString("sex"));
		stu.setAge(rs.getInt("age"));
		stu.setDateOfJoining(rs.getDate("age"));

		Address addr = new Address();
		
		addr.setCity(rs.getString("city"));
		addr.setState(rs.getString("state"));
		addr.setCountry(rs.getString("country"));
		addr.setZip(rs.getString("zip"));

		stu.setAddr(addr);
		return stu;
	}

}
