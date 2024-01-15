package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dto.PocketmonDto;

@RestController
public class PocketmonController {
	
	//***(중요)***
	//등록된것들은 "주세요~"가 된다 (DI,의존성 주입)
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//등록페이지
	//-insert into pocketmon(...)values(?,?,?)
	//- /insert?pocketmonNo=77&pocketmonName=테스트&pocketmonType=테스트
	@RequestMapping("/insert")
	public String insert(
			@RequestParam int pocketmonNo, 
			@RequestParam String pocketmonName, 
			@RequestParam String pocketmonType) {
		String sql = "insert into pocketmon("
				+ "pocketmon_no, "
				+ "pocketmon_name, "
				+ "pocketmon_type"
				+") values(?,?,?)";
		Object[] data = {pocketmonNo, pocketmonName, pocketmonType};
		jdbcTemplate.update(sql,data);
		return "포켓몬스터 등록 완료";
	}
	
	//업그레이드
	//-전달되는 데이터를 낱개가 아닌 객체(DTO)로 저장
	//-***(주의)**@RequestParam 이 아니라 @ModelAtrribute사용
	//-//- /insert2?pocketmonNo=77&pocketmonName=테스트&pocketmonType=테스트
	@RequestMapping("/insert2")
	//public String insert2(PocketmonDto dto) {
	public String insert2(@ModelAttribute PocketmonDto dto) {
		String sql = "insert into pocketmon("
				+ "pocketmon_no, "
				+ "pocketmon_name, "
				+ "pocketmon_type"
				+") values(?,?,?)";
		Object[] data = {dto.getPocketmonNo() , dto.getPocketmonName(), dto.getPocketmonType()};
		jdbcTemplate.update(sql,data);
		return "포켓몬 등록";
	}
	
	
	
	
	
}
