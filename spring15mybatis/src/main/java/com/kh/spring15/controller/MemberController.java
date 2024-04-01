package com.kh.spring15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring15.dao.MemberDao;
import com.kh.spring15.vo.MemberComplexVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {
	
			@Autowired
			private MemberDao memberDao;
	
			//게시판에서는 empty string으로 전달되는 파라미터를 null로 간주하도록 설정
			//@InitBinder 설정으로 구현
			//빈 문자열을 null로 처리하는 도구 설정 (boardController에서 가져옴)
			@InitBinder
			public void initBinder(WebDataBinder binder) {
				binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
			}
	
	//회원에 대한 복합 검색 페이지
	@RequestMapping("/complex")
	public String complex(@ModelAttribute MemberComplexVO vo, Model model) {
		model.addAttribute("vo",vo);
		model.addAttribute("list",memberDao.selectList(vo));
		return "/WEB-INF/views/complex.jsp";
	}
}
