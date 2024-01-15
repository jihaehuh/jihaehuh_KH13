package com.kh.spring03.controller;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링의 1원칙 : 무조건 등록부터 해라(IoC,제어반전)
@RestController
public class QuizController {

	//페이지 (메뉴생성)
	@RequestMapping("/dice")
	public String dice() {
		Random r = new Random();
		int number = r.nextInt(6)+1;
		return "주사위 : "+number;
		//return String.valueOf(number);
		
	}
		@RequestMapping("/lotto")
		public String lotto() {
			Random r = new Random();
			Set<Integer> lottoNumbers = new TreeSet<>();
			while(lottoNumbers.size() <6) {
				lottoNumbers.add(r.nextInt(45)+1);
			}
			return "로또번호 : "+lottoNumbers;	
		}
		@RequestMapping("/food")
			public String food() {
			String [] menus = new String[] {
					"피자","김밥","낙곱새"
			};
			Random r = new Random();
			int index = r.nextInt(menus.length);
			
			return "메뉴 : " +menus[index];
		}
	}

