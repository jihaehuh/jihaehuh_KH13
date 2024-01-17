package com.kh.spring07.controller;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07.dao.StudentDao;
import com.kh.spring07.dto.StudentDto;

@RestController
@RequestMapping("/student")  //공용주소
public class StudentController {
		@Autowired
		private StudentDao dao;
		
		@RequestMapping("/add")
		public String insert(@ModelAttribute StudentDto dto) {
			dao.insert(dto);
			return "학생 등록 완료";
		}
		//http://localhost:8080/student/add?name=주지훈&koreanScore=89&mathScore=97&englishScore=96
		
		//수정
		@RequestMapping("/edit")
		public String edit(@ModelAttribute StudentDto dto) {
			if(dao.update(dto)){
				return "학생 정보 수정 완료";
			}
			else {
				return "존재하지 않는 학생 정보";
			}
		}
		//http://localhost:8080/student/edit?studentId=3&name=주지윤&koreanScore=89&mathScore=97&englishScore=96
		
		//삭제
		@RequestMapping("/delete")
		public String delete(@RequestParam int studentId) {
			if(dao.delete(studentId)) {
				return "학생 정보 삭제 완료";
				
			}
			else {
				return "존재하지 않는 학생 정보";
			}
		}
		//http://localhost:8080/student/delete?studentId=3
		//단순 목록 조회
		@RequestMapping("/list")
		public String list(
				@RequestParam(required = false ) String column,
				@RequestParam(required = false ) String keyword) {
			boolean isSearch = column !=null && keyword !=null;
			List<StudentDto>list;
			if(isSearch) {
				list = dao.selectList(column, keyword);
			}
			else {
				list = dao.selectList();
			}
			StringBuffer buffer = new StringBuffer();
			for(StudentDto dto : list) {
				buffer.append(dto.getStudentId());
				buffer.append(",");
				buffer.append(dto.getName());
				buffer.append(",");
				buffer.append(dto.getKoreanScore());
				buffer.append(",");
				buffer.append(dto.getMathScore());
				buffer.append(",");
				buffer.append(dto.getEnglishScore());
				buffer.append("<br>");				
			}
			return buffer.toString();
		}
		//http://localhost:8080/student/list?column=name&keyword=김
		//한항목 조회
		@RequestMapping("/detail")
		public String detail(@RequestParam int studentId) {
			StudentDto dto = dao.selectOne(studentId);
			DecimalFormat fmt = new DecimalFormat("#,##0.00");
			if(dto != null) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("학생번호 - " + dto.getStudentId() + "<br>");
				buffer.append("학생명 - " + dto.getName() + "<br>");
				buffer.append("국어점수 - " + dto.getKoreanScore() + "점<br>");
				buffer.append("수학점수 - " + dto.getMathScore() + "점<br>");
				buffer.append("영어점수 - " + dto.getEnglishScore() + "점<br>");
				buffer.append("총점 - " + dto.getTotal() + "점<br>");
				buffer.append("평균 - " + fmt.format(dto.getAverage()) + "점<br>");
				return buffer.toString();
			}
			else {
				return "존재하지 않는 학생 번호";
			}
		}
		//http://localhost:8080/student/detail?studentId=1

}
