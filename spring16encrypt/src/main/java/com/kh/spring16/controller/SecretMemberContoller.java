package com.kh.spring16.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring16.dao.SecretMemberDao;
import com.kh.spring16.dto.SecretMemberDto;

import jakarta.servlet.http.HttpSession;

@Controller
public class SecretMemberContoller {


	
	@Autowired
	private SecretMemberDao secretMemberDao;
	//회원가입 
	//정보 입력 페이지
	@GetMapping("/join")
	public String join() {
//		return "/WEB-INF/views/join.jsp";    //WEB-INF/views/ =prefix , .jsp =suffix  -properties에 추가 했으니 이제 안씀
		return "join";
	}
	@PostMapping("/join")
	public String join(@ModelAttribute SecretMemberDto secretMemberDto) {
		secretMemberDao.insert(secretMemberDto);
		return "redirect:join";
	}
	
	//로그인
	@GetMapping("/login")
	public String login() {
//		return "/WEB-INF/views/login.jsp";
//		return"member/login"; //물음표는 리다이렉트일때만 쓸 수 있음
		return"login";
	}
	@PostMapping("login") 
	public String login(@ModelAttribute SecretMemberDto secretMemberDto,
			HttpSession session) {
		SecretMemberDto findDto = secretMemberDao.selectOneByMemberPw(secretMemberDto);
		if(findDto != null) {
			session.setAttribute("loginId",findDto.getMemberId());
			return "redirect:/";
		}
		else {
			return"redirect:/login?error";
		}
	}
	
		//로그아웃
		@RequestMapping("logout")
		public String logout(HttpSession session) {
			session.removeAttribute("loginId");
			return "redirect:/";
		}
		
		//메인 페이지
		@RequestMapping("/") 
		public String home() {
			return "home";
		}
		
		
		
	
	
	
	
	
}
