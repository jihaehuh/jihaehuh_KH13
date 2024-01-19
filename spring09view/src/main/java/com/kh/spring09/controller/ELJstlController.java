package com.kh.spring09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring09dto.PocketmonDto;

@Controller
@RequestMapping("/el-jstl")
public class ELJstlController {
		
	@RequestMapping("/test01")
	public String test01(Model model) {
		model.addAttribute("a", 100);
		model.addAttribute("b", "hello");
		model.addAttribute("c",3.14);
		return"/WEB-INF/views/elJstl/test01.jsp";
	}
	@RequestMapping("/test02")
	public String test02(Model model) {
		//객체 추가
		PocketmonDto dto = new PocketmonDto();
		dto.setPocketmonNo(21);
		dto.setPocketmonName("피카츄");
		dto.setPocketmonType("전기");
		model.addAttribute("dto",dto);
		return "/WEB-INF/views/elJstl/test02.jsp";
	}
	
	@RequestMapping("/test03")
	public String tes03() {
		return "/WEB-INF/views/elJstl/test03.jsp";
	}
	
}
