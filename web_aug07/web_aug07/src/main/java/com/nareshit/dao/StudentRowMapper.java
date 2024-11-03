package com.nareshit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nit.model.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student();
		st.setStuId(rs.getInt("stu_id"));
		st.setFirstName(rs.getString("first_name"));
		st.setLastName(rs.getString("last_name"));
		return st;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
