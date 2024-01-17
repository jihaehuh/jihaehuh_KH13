package com.kh.spring07.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring07.dto.StudentDto;

@Service
public class StudentMapper implements RowMapper<StudentDto> {

	@Override
	public StudentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDto dto = new StudentDto();
		dto.setStudentId(rs.getInt("student_id"));
		dto.setName(rs.getString("name"));
		dto.setKoreanScore(rs.getFloat("korean_score"));
		dto.setMathScore(rs.getFloat("math_score"));
		dto.setEnglishScore(rs.getFloat("english_score"));
		return dto;
	}
	
}