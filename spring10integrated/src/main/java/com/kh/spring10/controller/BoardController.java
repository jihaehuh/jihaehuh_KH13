package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.MemberDto;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private MemberDao memberDao;
	@Autowired
	private BoardDao boardDao;
	
	//목록
	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column, 
			@RequestParam(required = false) String keyword, Model model) {
		boolean isSearch = column != null && keyword != null;
		if(isSearch) {
			model.addAttribute("list", boardDao.selectList(column, keyword));
		}
		else {
			model.addAttribute("list", boardDao.selectList());
		}
		return "/WEB-INF/views/board/list.jsp";
	}
	

	
	//상세
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo ,Model model) {
		//조회수 중복방지 --인터셉터에서 한번에 했다가 안했다가 하도록 만들수 있다
		//boardDao.updateBoardReadcount(boardNo); //이걸 안지우면 인터셉터에도 있어서 두개씩 올라간다
		
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		//조회한 게시글 정보에 있는 회원 아이디로 작성자 정보를 불러와서 첨부
		if(boardDto.getBoardWriter() != null) { 
			//탈퇴한 사람이 작성했을 경우 
		MemberDto memberDto = memberDao.selectOne(boardDto.getBoardWriter()); 
		model.addAttribute("memberDto", memberDto);
		}
		return "/WEB-INF/views/board/detail.jsp";
	}
	/*
	//게시글 작성(등록)
	@GetMapping("/write")
	public String wirte() {
		return "/WEB-INF/views/board/write.jsp";
	}
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto) {
		boardDao.insert(boardDto);
		return "redirect:list?boardNo="+boardDto.getBoardNo();	
		}
	//게시글 삭제
	@GetMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		;
		return "redirect:list";
	}
	*/
}
