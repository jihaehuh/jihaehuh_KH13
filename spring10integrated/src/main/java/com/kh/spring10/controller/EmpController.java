
package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dto.EmpDto;


@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpDao dao;
	
	//@RequestMapping("/insert")
	@GetMapping("/insert") //Get방식 -일반적인 주소를 이용한 접근
	public String insert() {
	return"/WEB-INF/views/emp/insert1.jsp";
	}
	//@RequestMapping("/insert")
	@PostMapping("/insert") //Post방식 - Form을 이용한 데이터 전송 접근
	public String insert(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		// return "redirect:/emp/insert3"; //절대
		return "redirect:insert3"; //상대
		
	}
	@RequestMapping("/insert3")
	public String insert3() {
		return "/WEB-INF/views/emp/insert3.jsp";
	}
	//수정
	//수정 페이지
	//- 수정페이지는 일반적으로 상세/목록에서 들어온다
	//- 처음에 정보가 다 표시되어 있어야 한다
	//- 그러기위해서는 출력페이지에서 기본키(PK)정도는 전달받아야한다
	//- 무언가를 화면으로 전달 하고 싶다면 매개변수에 Model객체를 선언
	//- model 은 Map<String,Object>형태
		//- 등록과 매우 유사한 흐름을 가진다
		//- 입력된 정보 중 기본키를 제외한 나머지 정보를 수정한다
		//- 수정이 될 수도 안될 수도 있다. 그에 따른 결과 페이지가 달라진다
		
		@GetMapping("/edit")
		public String edit(@RequestParam int empNo , Model model) {
			EmpDto dto = dao.selectOne(empNo);
			//model.addAtrribute("이름","데이터");
			model.addAttribute("dto",dto);
			return "/WEB-INF/views/emp/edit.jsp";
		}
		
		@PostMapping("/edit")
		public String edit(@ModelAttribute EmpDto dto) {
			if(dao.update(dto)) {
				//return "redirect:/emp/editSuccess"; //절대
				return "redirect:editSuccess";
			}
			else {
				//return "redirect:/emp/editFail";
				return "redirect:editFail";
			}
		}
		@RequestMapping("/editSuccess")
		public String editSuccess() {
			return "/WEB-INF/views/emp/editSuccess.jsp";
		}
		
		@RequestMapping("/editFail")
		public String editFail() {
			return "/WEB-INF/views/emp/editFail.jsp";
		}
		
		//목록,검색 페이지
		//@RequestMapping( value ="/list". method = RequestMethod.GET)
		@RequestMapping("/list")
		public String list(
				@RequestParam (required = false)String column,
				@RequestParam(required = false)String keyword,
				Model model) {
			boolean isSearch = column != null && keyword != null;
			
			//List<EmpDto> list = isSeaech?
			//	dao.selectList(column,keyword) :dao.selectList();
			
			List<EmpDto>list;
			if(isSearch) {
				list=dao.selectList(column, keyword);
			}
			else {
				list =dao.selectList();
			}
			model.addAttribute("list",list);
			return "/WEB-INF/views/emp/list.jsp";
		}
		
		
		
	
}
