/*
 * Menu 등록 문제
spring06menu 프로젝트에 menu 등록 관련된 파일과 코드를 추가

MenuDao : 메뉴 등록 처리 클래스
MenuDto : 메뉴 데이터 통합 클래스
MenuMapper : 메뉴 데이터 변환 클래스
MenuController : 메뉴 관련 처리 페이지 제공 클래스

필요한 모든 클래스를 등록한 뒤 연동하여 사용

등록 주소 : /menu/insert
 */
package com.kh.spring06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.MenuDao;
import com.kh.spring06.dto.MenuDto;

@RestController//등록
@RequestMapping("/menu")//공용주소
public class MenuController {

	//주세요
	@Autowired
	private MenuDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		dao.insert(dto);
		return "메뉴 등록 완료";    
		//http://localhost:8080/menu/insert?menuNameKor=디카페인아메리카노&menuNameEng=DecafIceAmericano&menuType=음료&menuPrice=5500
		//http://localhost:8080/menu/insert?menuNameKor=아메리카노&menuNameEng=Americano&menuType=음료&menuPrice=5500
		}
	
		//수정
	
			@RequestMapping("/edit")
			public String edit(@ModelAttribute MenuDto dto) {
				boolean result = dao.update(dto);
				if(result) {
					return "메뉴 수정 완료";
				}
				else {
					return "존재하지 않는 메뉴 번호";
				}
			}
			//http://localhost:8080/menu/edit?menuNo=1&menuNameKor=찹살떡&menuNameEng=ddock&menuType=음식&menuPrice=6000
	
}
