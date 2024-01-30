package com.kh.spring10.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dto.BoardDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//게시글의 조회수와 관련된 사전 처리를 수행하는 인터셉터
@Service
public class BoardReadcountInterceptor implements HandlerInterceptor{
	@Autowired
	private BoardDao boardDao;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//인터셉터에서 파라미터를 받고 싶다면 
		//-request.getParameter(이름);
		//-반환형이 String 이므로 원하는 형태로 바꿔서 사용- 원하는 형태 :Integer.parseInt();
		
		
		//파라미터에서 글 번호 추출 
		int boardNo = Integer.parseInt(request.getParameter("boardNo")); //파라미터는 스트링인데 인트로 읽어오라해서 오류남 -그래서 Integer을 사용 
		//request.getParameter("boardNo"); //수동으로 사용자에게서 파라미터를 읽어오는 방법
		//System.out.println("조회수 중복 방지 인터셉터 실행");
		//1.비회원 조회수 증가 방지 처리 
		HttpSession session = request.getSession();
		String loginId =(String) session.getAttribute("loginId");
		if(loginId == null) {
			return true; //이제 회원만 조회수가 늘어남
		}
		//2.본인 글일 경우 조회수 증가 방지 처리
		//로그인한 아이디 == 글 작성자 (하지만 우리가 아는건 boardNo)
		//- boardDto --> 작성자 조회가능--> 아이디뽑기 ( 로그인 아이디가 null은 필요없음)
		BoardDto boardDto = boardDao.selectOne(boardNo);
		if(loginId.equals(boardDto.getBoardWriter())) {
			return true;
		}
		//3. 작성자가 탈퇴한 사용자면 조회수 증가 방지 처리
		if(boardDto.getBoardWriter() == null) {
			return true;
		}
		
		//4. 한번이라도 본적이 있는 글이라면 조회수 증가 방지 처리
		//-여러방법 중에 HttpSession을 사용하는 방법으로 구현
		//세션에 history라는 이름으로 글 번호를 저장할 저장소를 저장
		//- ex) history =10,13,15 과 같은 형태로 만들예정
		//- history 에 해당하는 저장소는 ???형태로 만든다  --HashSet<Integer>
		
		//조회수 증가 & 중복 방지
		boardDao.updateBoardReadcount(boardNo);
			return true;//통과
			
	}
	
	
	
}
