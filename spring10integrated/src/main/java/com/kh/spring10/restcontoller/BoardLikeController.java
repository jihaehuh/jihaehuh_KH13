package com.kh.spring10.restcontoller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//corssorigin 주석 처리
//import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10.dao.BoardLikeDao;

import jakarta.servlet.http.HttpSession;

//@CrossOrigin       //신청안한 사람도 들어오세요 (지금은 안걸어도 된다.,...?) 

@RestController
@RequestMapping("/rest/board_like")
public class BoardLikeController {
	@Autowired
	private BoardLikeDao boardLikeDao;
	
	//회원의 글에 대한 좋아요 상태를 조회
		@RequestMapping("/check")
		public Map<String, Object> check (
				HttpSession session, @RequestParam int boardNo) {
			String loginId = (String)session.getAttribute("loginId");

			Map<String, Object> data = new HashMap<>();
			data.put("state", boardLikeDao.check(loginId, boardNo));
			data.put("count", boardLikeDao.count(boardNo));

			return data;
		}

		//하트를 클릭한 경우 실행할 매핑
	
	//하트를 처리하는 기록   //아이디는 세션 , 글번호필요   
	@RequestMapping("/toggle") 
	public Map<String, Object> toggle(
			HttpSession session, @RequestParam int boardNo) {
		//하트 색깔, 개수 가 필요
		// -객체 형태 ( 클래스는 만들기 귀찮을때 Map으로 한다) 
		// -사람들은 클래스 만들기를 더 선호함 (하지만 우리는 Map으로 해볼꺼임)
		String loginId = (String)session.getAttribute("loginId");
		Map<String, Object> data = new HashMap<>();
		if(boardLikeDao.check(loginId,boardNo)) {//좋아요 누른적 있으면
			boardLikeDao.delete(loginId, boardNo);//좋아요 취소
			data.put("state", false);
		}
		else {
			boardLikeDao.insert(loginId, boardNo);//좋아요 설정
			data.put("state", true);
		}
		
		//바뀐 좋아요 개수확인 
		int count = boardLikeDao.count(boardNo);
		data.put("count", count);
		
		return data;//좋아요 관련된 정보 
	}
}
