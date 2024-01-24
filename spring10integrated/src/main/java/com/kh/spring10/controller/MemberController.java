package com.kh.spring10.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.MemberDto;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberDao memberDao;

	@GetMapping("/join")
	public String join() {
		return "/WEB-INF/views/member/join.jsp";
	}
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDto memberDto) {
		memberDao.insert(memberDto);
		return "redirect:joinFinish";
	}
	@RequestMapping("/joinFinish")
	public String joinFinish() {
		return "/WEB-INF/views/member/joinFinish.jsp";
	}
	//테스트 로그인 & 로그아웃
	//-HttpSession을 사용하고 싶다면 매개변수에 선언만 하면 된다
	//-등록:session.setAttribute("key",value)
	//-확인:session.getAttribute("key")
	//-삭제:session.removeAttribute("key")
	@RequestMapping("/testLogin")
	public String testLogin(HttpSession session) {
			session.setAttribute("loginId","testuser1");//이름,회원테이블의 pk값
			return "redirect:/";
	}
	@RequestMapping("/testLogout")
	public String testLogout(HttpSession session) {
		session.removeAttribute("loginId");
		return "redirect:/";
	}
	//실제 로그인
	//-아이디와 비밀번호 검사를 통과해야만 세션에 데이터를 추가한다
	//-사용자가 입력한 아이디를 추가한다
	@GetMapping("/login")
	public String login() {
		return "/WEB-INF/views/member/login.jsp";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDto inputDto,HttpSession session) {//아이디, 비밀번호 : 회원정보
		//사용자가 입력한 아이디로 회원정보를 조회한다
		MemberDto findDto = memberDao.selectOne(inputDto.getMemberId()); //사용자가 입력한 아이디 받기
		//로그인 가능 여부를 판정
		boolean isValid = findDto != null && 
				inputDto.getMemberPw().equals(findDto.getMemberPw());//아이디가 있어야하고 비밀번호가 일치한다면
		//결과에 따라 다른 처리
		if(isValid) {
			//세션에 데이터 추가
			session.setAttribute("loginId",findDto.getMemberId());//,사용자 ID
			return "redirect:/";
		}
		else {//로그인 실패
			 return "redirect:login?error";
		}
	}
	//실제 로그아웃
		//- 로그인 때 검사를 했으므로 추가 검사는 불필요
		//- 로그인 때 저장한 세션의 데이터만 삭제 처리
		@RequestMapping("/logout")
		public String logout(HttpSession session) {
			session.removeAttribute("loginId");
			return "redirect:/";
		}
	// 마이페이지
	//-(중요) 내 아이디는 HttpSession에 있다
	//-그리고 화면에 정보를 표시해야한다
		@RequestMapping("/mypage")
		public String mypage(Model model, HttpSession session) {//세션에서 꺼내야함
			//1.세션에 저장된 아이디를 꺼낸다
			String loginId=(String)session.getAttribute("loginId");  //세션에 있는 로그인아이디를 꺼내면 오브젝트여서 스트링이라 안맞아서 맞춰줘야함 
			//2.아이디에 맞는 정보를 조회한다
			MemberDto memberdto=memberDao.selectOne(loginId); //로그인을 했는데 아이디가 없다..? 말이 안됌
			//3. 화면에 조회한 정보를 전달한다
			model.addAttribute("memberDto",memberdto);
			
			//4. 연결될 화면을 반환한다
			return "/WEB-INF/views/member/mypage.jsp";
		}
		
	
	
}