
package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.MenuDao;
import com.kh.spring10.dto.MenuDto;

@Controller//등록
@RequestMapping("/menu")//공용주소
public class MenuController {


	@Autowired   // 등록 ->주세요 
	private MenuDao dao;
	
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/menu/insert.jsp";    
		}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		dao.insert(dto);
		//return "redirect:/menu/insertComplete"; //절대
		return "redirect:insertComplete"; //상대
		}
	@RequestMapping("/insertComplete")
	public String insertComplete() {
		return"/WEB-INF/views/menu/insertComplete.jsp";
	}
	@GetMapping("/change")
	public String edit (@RequestParam int menuNo,Model model) {
		MenuDto dto = dao.selectOne(menuNo);
		model.addAttribute("dto",dto);
		return "/WEB-INF/views/menu/change.jsp";
	}
	
	@PostMapping("/change")
	public String edit (@ModelAttribute MenuDto dto) {
		if(dao.update(dto)) {
			return "redirect:changeSuccess";
		}
		else {
			return "redirect:changeFail";
		}
	}
	@RequestMapping("/changeSuccess") 
	public String editSuccess() {
		return "/WEB-INF/views/menu/changeSuccess.jsp";
	}
	
	@RequestMapping("/changeFail")
	public String editFail() {
		return "/WEB-INF/views/menu/changeFail.jsp";
	}
	




   






}