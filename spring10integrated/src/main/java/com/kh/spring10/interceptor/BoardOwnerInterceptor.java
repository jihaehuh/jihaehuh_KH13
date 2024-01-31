package com.kh.spring10.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dto.BoardDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Service
public class BoardOwnerInterceptor implements HandlerInterceptor {
	@Autowired 
	private BoardDao boardDao;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		BoardDto boardDto = boardDao.selectOne(boardNo);
		
		String loginId =(String)session.getAttribute("loginId");
		String loginLevel =(String)session.getAttribute("loginLevel");
		
		//관리자면 통과
		if(loginLevel != null && loginLevel.equals("관리자")) {
			return true;
		}
		
		//내 글 이라면 통과
		if(loginId != null && loginId.equals(boardDto.getBoardWriter()))  { //아이디가 널이면 안되고 작성자랑 아이디랑 같아야함
			return true;
		}
		
		//나머지 차단
			response.sendError(403);
			return false;
	}



}
