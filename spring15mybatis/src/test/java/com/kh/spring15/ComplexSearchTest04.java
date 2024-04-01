package com.kh.spring15;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ComplexSearchTest04 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		Map<String, Object> data = new HashMap<>();
//		data.put("memberId", "testuser2");
//		data.put("memberNick", "테스트");
//		data.put("memberContact", "01080116907");
//		data.put("minPoint", 1);
//		data.put("maxPoint", 60000);
//		data.put("memberJoin", "2024-01-31");
//		data.put("minLoginDate", "2024-03-01");
//		data.put("maxLoginDate", "2024-03-06");
//		data.put("memberLevelList",List.of());
//		data.put("memberLevelList",List.of("일반회원")); //문자열 여러개 자료형 => List<string>
//		data.put("memberLevelList",List.of("일반회원","우수회원"));
//		data.put("memberLevelList",List.of("일반회원","우수회원","관리자"));  //데이터의 개수를 모르기때문에 반복문 사용 
		List<MemberDto> list = sqlSession.selectList("member.complex",data);  //데이터가 있어도 없어도 실행되게 하려고
		for(MemberDto memberDto : list) {
			log.debug("member = {}", memberDto);
		}
		
		}
}
