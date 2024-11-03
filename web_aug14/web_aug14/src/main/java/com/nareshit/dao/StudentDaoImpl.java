package com.nareshit.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nareshit.model.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao{

	private RowMapper<Student> rowMapper;
	private String GET_ALL = "select * from student";
	private String GET_ONE = "select * from student where stu_id=?";
	private String SAVE="insert into student(first_name, last_name) values (?,?)";
	private String DELETE="delete from student where stu_id=?";
	private String UPDATE="update student set first_name=?, last_name=? where stu_id=?";
	
	
	public void setRowMapper(RowMapper<Student> rowMapper) {
		this.rowMapper = rowMapper;
	}
	@Override
	public List<Student> getAllStudents() {
		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}
	@Override
	public void saveStudent(Student st) {
		getJdbcTemplate().update(SAVE,st.getFirstName(),st.getLastName());
	}
	@Override
	public void deleteStudent(Integer stuId) {
		getJdbcTemplate().update(DELETE,stuId);
		
	}
	@Override
	public void updateStudent(Student st) {
		getJdbcTemplate().update(UPDATE,st.getFirstName(),st.getLastName(),st.getStuId());
		
	}
	@Override
	public Student getStudent(Integer stuId) {
		List<Student> students =  getJdbcTemplate().query(GET_ONE, rowMapper,stuId);
		return students.get(0);
	}

	
	
	
	
	
	
	
	
}
