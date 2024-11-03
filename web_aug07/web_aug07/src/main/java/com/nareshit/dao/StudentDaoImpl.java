package com.nareshit.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nit.model.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao{

	private RowMapper<Student> rowMapper;
	private String GET_ALL = "select * from student";
	
	public void setRowMapper(RowMapper<Student> rowMapper) {
		this.rowMapper = rowMapper;
	}
	@Override
	public List<Student> getAllStudents() {
		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}

	
	
	
	
	
	
	
	
}
