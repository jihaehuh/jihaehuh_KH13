package com.kh.spring07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
