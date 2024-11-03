package com.nareshit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nareshit.model.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student();
		st.setStuId(rs.getInt("stuid"));
		st.setFirstName(rs.getString("fname"));
		st.setLastName(rs.getString("lname"));
		return st;
	}

}
