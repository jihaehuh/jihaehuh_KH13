package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.MemberDto;

import jakarta.servlet.http.HttpSession;

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
	
	//게시글 작성(등록)  //제목 + 내용 + 등록
	@GetMapping("/write")
	public String wirte() {
		return "/WEB-INF/views/board/write.jsp";
	}
	@PostMapping("/write") //등록을눌렀을때 여기로 이동 (세션에서 아이디, DB에서 내용받기)
	public String write(@ModelAttribute BoardDto boardDto ,HttpSession session) {  //제목,내용은 들어있고 작성자 ,번호를 넣어야한다
		//세션에서 로그인한 사용자의 아이디를 추출
		String loginId =(String)session.getAttribute("loginId");
		
		//아이디를 게시글 정보에 포함시킨다 
		boardDto.setBoardWriter(loginId); //DTO에는 이제 3개 아이디 ,제목 ,내용 이 들어감
		
		//명령 분할
		int sequence = boardDao.getSequence(); //DB에서 시퀀스 번호를 추출
		boardDto.setBoardNo(sequence); //게시글 정보에 추출한 번호를 포함시킨다
		boardDao.insert(boardDto); //등록
		
		return "redirect:detail?boardNo="+sequence;	
		
		
		}
	//게시글 삭제
	@GetMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		;
		return "redirect:list";
	}
	
}
