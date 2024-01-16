package com.kh.spring07.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.kh.spring07.dto.StudentDto;
import com.kh.spring07.mapper.StudentMapper;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private StudentMapper mapper;
	
	public void insert(StudentDto dto) {
		//정보 등록
		String sql ="insert into student( "
				+"student_id, name, korean_score, math_score, english_score"
				+") "
				+"values(student_seq.nextval,?,?,?,?)";
		Object[]data = {
				dto.getName(),dto.getKoreanScore(),dto.getMathScore(),dto.getEnglishScore()
		};
		jdbcTemplate.update(sql,data);
	}
	//정보 수정
	public boolean update(StudentDto dto) {
		String sql = "update student "
				+ "set name=?, korean_score=?, math_score=?, english_score=? "
				+ "where student_id=?";
		Object[]data = {
				dto.getName(), dto.getEnglishScore(), dto.getKoreanScore(), 
				dto.getMathScore(), dto.getStudentId()
		};
		return jdbcTemplate.update(sql,data)>0;
	}
	//정보삭제
	public boolean delete(int studentId) {
		String sql ="delete student where student_id=?";
		Object[]data = {studentId};
		return jdbcTemplate.update(sql,data)>0;
	}
	//항목 +키워드 검색
	public List<StudentDto> selectList(){
		String sql ="select * from student order by student_id asc";
		return jdbcTemplate.query(sql, mapper);
	}
	public List<StudentDto> selectList(String column, String keyword) {
		String sql = "select * from student "
						+ "where instr("+column+", ?) > 0 "
						+ "order by "+column+" asc, student_id asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
	}
	//한 항목 조회(번호)
		
	
	
	
	
	
}
