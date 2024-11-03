package com.nareshit.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nareshit.model.Student;

public class StudentDaoImpl implements StudentDao{
	
	private String INSERT = "insert into student values(?,?,?)";
	private String UPDATE = "update student set fname=?, lname=? where stuid=?";
	private String DELETE = "delete from student where stuid=?";
	private String GET_ONE = "select * from student where stuid=?";
	private String GET_ALL = "select * from student";
	
	private JdbcTemplate jdbcTemplate;
	private RowMapper<Student> rowMapper;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setRowMapper(RowMapper<Student> rowMapper) {
		this.rowMapper = rowMapper;
	}
	@Override
	public void saveStudent(Student st) {
		jdbcTemplate.update(INSERT,st.getStuId(),st.getFirstName(),st.getLastName());	
	}

	@Override
	public void updateStudent(Student st) {
		jdbcTemplate.update(UPDATE,st.getFirstName(),st.getLastName(),st.getStuId());
	}

	@Override
	public void deleteStudent(Integer stuId) {
		jdbcTemplate.update(DELETE,stuId);	
	}

	@Override
	public Student getStudent(Integer stuId) {
		List<Student> students = jdbcTemplate.query(GET_ONE,new Object[] {stuId}, rowMapper);
		return students.get(0);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = jdbcTemplate.query(GET_ALL, rowMapper);
		return students;
	}
	
}
