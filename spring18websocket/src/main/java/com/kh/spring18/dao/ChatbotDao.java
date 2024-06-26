package com.kh.spring18.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring18.dto.ChatbotDto;

@Repository
public class ChatbotDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//목록 조회
	public List<ChatbotDto> selectList() {
		return sqlSession.selectList("chatbot.list");
	}
	//상세 조회
	public ChatbotDto selectOne(int chatbotNo) {
		return sqlSession.selectOne("chatbot.find",chatbotNo);
	}
}
