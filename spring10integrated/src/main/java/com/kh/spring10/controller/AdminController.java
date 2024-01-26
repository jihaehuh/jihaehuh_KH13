package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.Vo.StatVO;
import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dao.MenuDao;
import com.kh.spring10.dao.PocketmonDao;

//관리자가 이용할 수 있는 기능을 제공하는 컨트롤러
@Controller
@RequestMapping("/admin")
public class AdminController {
	//포켓몬스터 통계
	
	@Autowired
	private PocketmonDao pocketmonDao;
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/stat/pocketmon")
	public String statPocketmon(Model model) {
		List<StatVO> list =pocketmonDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/pocketmon.jsp";
	}
	
	//부서별 사원 수 통계
	@Autowired
	private EmpDao empDao;

	@RequestMapping("/stat/emp")
	public String statEmp(Model model) {
		//List<StatVO> list = empDao.statByType();
		//model.addAttribute("list", list);
		model.addAttribute("list", empDao.countByEmpType()); //위에 두줄 한번에 쓰기
		return "/WEB-INF/views/admin/stat/emp.jsp";
	}
	//유형별 메뉴 개수 통계
	@Autowired
	private MenuDao menuDao;
	
	@RequestMapping("/stat/menu")
	public String statMenu(Model model) {
		List<StatVO>list = menuDao.countByMenuType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/menu.jsp";
	}
	//등급별 인원수 통계
	
	@RequestMapping("/stat/member")
	public String statMember(Model model) {
		List<StatVO> list = memberDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/member.jsp";
	}
	
	@RequestMapping("/member/search")
	public String statMeberSearch(Model model) {
		List<StatVO> list = memberDao.statByType();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/member/search.jsp";
	}
	
}
