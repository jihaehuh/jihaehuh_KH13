package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.MenuDao;
import com.kh.spring14.dto.MenuDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MenuTest04 {
	
	@Autowired
	private MenuDao menuDao;
	
	//수정 
	//-등록 과 다른 점- 번호를 알려주고 바꾸고 싶은 정보를 넣어야함 
	@Test
	public void test() {
		MenuDto menuDto = new MenuDto();
		menuDto.setMenuNo(5); 
		menuDto.setMenuNameKor("감자탕");
		menuDto.setMenuNameEng("kamgatangg");
		menuDto.setMenuType("한식");
		menuDto.setMenuPrice(20000);
		if(menuDao.update(menuDto)) {
			log.debug("정보변경 성공");
		}
		else {
			log.debug("존재 하지 않는 대상");
		}
	}

}