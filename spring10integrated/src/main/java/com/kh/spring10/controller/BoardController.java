package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.MemberDto;

@Controller
@RequestMapping("/board")
public class BoardController {
	//list
	//edit
	//detail
	//write
	@Autowired
	private BoardDao boardDao;
	
	//목록 조회
	@RequestMapping("/list")
		public String search(@RequestParam(required = false) String column,
				@RequestParam(required = false) String keyword,
				Model model) {
		boolean isSearch = column != null && keyword != null;
		List <BoardDto> list = isSearch ?
				boardDao.selectList(column,keyword) :boardDao.selectList();
		return "/WEB-INF/views/board/list.jsp";
	}
	/*
	 * public String search(@RequestParam(required = false) String column,
			@RequestParam(required = false) String keyword,
			Model model
			) {
		boolean isSearch = column != null && keyword != null;
		List <BoardDto> list = isSearch ?
				boardDao.selectList(column,keyword) :boardDao.selectList();
		model.addAttribute("list", list);
	 */
}
