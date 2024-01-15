/*
 * Emp 등록 문제
spring05jdbc 프로젝트에 emp 등록 관련된 파일과 코드를 추가

EmpDao : 사원 등록 처리 클래스
EmpDto : 사원 데이터 통합 클래스
EmpMapper : 사원 데이터 변환 클래스
EmpController : 사원 관련 처리 페이지 제공 클래스

필요한 모든 클래스를 등록한 뒤 연동하여 사용

등록 주소 : /emp/insert
 */
package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.EmpDao;
import com.kh.spring05.dto.EmpDto;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpDao dao;

	@RequestMapping("/insert")
	public String insert(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		return "사원 등록 완료";
	}

}
