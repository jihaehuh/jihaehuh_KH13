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
public class ComplexSearchTest03 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		String column ="member_id";
		String keyword="test";
		
		//(주의 ) mybatis 는 구문 호출 시 데이터를 한개만 첨부 할 수 있다.
		
		//봉투에 담아서 넣어주기 
		
		
		//column 과 keyword 유무에 따라  mybatis 구문이 변화하여 실행된다
		//즉 , 자바에서는 조건으로 검색인지 목록인지 구분할 필요가 없다 (DB에 관하여)
		Map<String, Object> data = new HashMap<>();
//		data.put("column", column);
//		data.put("keyword", keyword);
		
		List<MemberDto> list = sqlSession.selectList("member.listOrSearch",data);  //데이터가 있어도 없어도 실행되게 하려고
		for(MemberDto memberDto : list) {
			log.debug("member = {}",memberDto);
		}
		
		}
}
