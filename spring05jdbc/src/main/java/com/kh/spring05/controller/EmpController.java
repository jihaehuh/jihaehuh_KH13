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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	//수정

			@RequestMapping("/edit")
			public String edit(@ModelAttribute EmpDto dto) {
				boolean result = dao.update(dto);
				if(result) {
					return "사원정보 수정";
				}
				else {
					return "존재하지 않는 사원 번호";
				}
			}
	//http://localhost:8080/emp/edit?empNo=1&empName=바꾼이름&empDept=무소속&empDate=2024-01-01&empSal=0
			
			
			
			//목록 조회
			@RequestMapping("/list")
			public String list(
					@RequestParam(required = false, defaultValue = "") String column,
					@RequestParam(required = false, defaultValue = "") String keyword
				) {
//				boolean isSearch = column != null && keyword != null;
				boolean isSearch = !column.equals("") && !keyword.equals("");
				
//				List<EmpDto> list;
//				if(isSearch) {
//					list = dao.selectList(column, keyword);
//				}
//				else {
//					list = dao.selectList();
//				}
				List<EmpDto> list = isSearch ? dao.selectList(column, keyword) : dao.selectList();
				
				StringBuffer buffer = new StringBuffer();
				for(EmpDto dto : list) {
//					buffer.append(dto.getEmpName());
//					buffer.append("/");
//					buffer.append(dto.getEmpDept());
//					buffer.append("/");
//					buffer.append(dto.getEmpDate());
					buffer.append(dto.toString());
					buffer.append("<br>");
				}
				return buffer.toString();
			}
			@RequestMapping("/detail")
			public String detail(@RequestParam int empNo) {
				EmpDto dto = dao.selectOne(empNo);
				if(dto != null) {
					StringBuffer buffer = new StringBuffer();
					buffer.append(dto.getEmpName());
					buffer.append(",");
					buffer.append(dto.getEmpDept());
					buffer.append(",");
					buffer.append(dto.getEmpDate());
					buffer.append(",");
					buffer.append(dto.getEmpSal());
					buffer.append(",");
					
					
					return buffer.toString();
					
				}
				else {
					return "존재하지 않는 사원번호 입니다";
				}
			}
			
			
			
			
			
			
			
			
			
			
		}
