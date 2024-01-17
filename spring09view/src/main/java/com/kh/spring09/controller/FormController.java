package com.kh.spring09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	@RequestMapping("/form") //공용주소
	public class FormController {
		
		@RequestMapping("/test1")
		public String test1() {
			return "/WEB-INF/views/form/test1.jsp";
		}
}
