package com.kh.spring10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//메인페이지는 가장 짧은 주소로 서비스
	//공용주소를 부여하지 않고 "/"로 주소를 부여한다
	//가장짧은 주소는 "/"
	@RequestMapping("/")
	public String home() {
		return "/WEB-INF/views/home.jsp";
	}
}
