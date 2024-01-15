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
	
	
}
