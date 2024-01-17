package com.kh.spring08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller //결과를 화면으로 반환하는 컨트롤러
//@RestController //결과를 직접 반환하는 컨트롤러
public class HomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		//return "<h1>Welcome<h1/>";
		return "/WEB-INF/views/welcome.jsp"; //화면 주소
	}
}
