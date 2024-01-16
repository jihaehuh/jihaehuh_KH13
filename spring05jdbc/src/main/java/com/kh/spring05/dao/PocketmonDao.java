package com.kh.spring05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.PocketmonDto;
import com.kh.spring05.mapper.PocketmonMapper;

//DAO도 이제부터는 등록 해야한다
//-@Repository는 파일이나 데이터베이스 

@Repository
public class PocketmonDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PocketmonMapper mapper;

	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon("
				+ "pocketmon_no, "
				+ "pocketmon_name, "
				+ "pocketmon_type"
				+") values(?,?,?)";
		Object[] data = {dto.getPocketmonNo() , dto.getPocketmonName(), dto.getPocketmonType()};
		jdbcTemplate.update(sql,data);
	}
	
	//수정
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon "
						+ "set pocketmon_name=?, pocketmon_type=? "
						+ "where pocketmon_no=?";
		Object[] data = {
			dto.getPocketmonName(), dto.getPocketmonType(),
			dto.getPocketmonNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}
	//등록주소 
	//http://localhost:8080/pocketmon/edit?pocketmonNo=1&pocketmonName=바꾼이름&pocketmonType=바꿨음
	
	//삭제
	public boolean delete(int pocketmonNo) { //삭제는 프라이머리 키로 한다(상세 검색과 비슷)
		String sql ="delete pocketmon where pocketmon_no=?";
		Object[]data = {pocketmonNo};
		return jdbcTemplate.update(sql,data)>0;
		
	}
	//삭제 주소
	//http://localhost:8080/pocketmon/delete?pocketmonNo=66
	
	
	
	
	
	
	
	
	
	
	
}
