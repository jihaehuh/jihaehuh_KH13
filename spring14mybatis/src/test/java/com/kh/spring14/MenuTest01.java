package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.MenuDao;
import com.kh.spring14.dto.MenuDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MenuTest01 {
	
	@Autowired
	private MenuDao menuDao;
	
	//등록
		@Test
		public void test() {
			MenuDto menuDto = new MenuDto();
			//번호는 시퀀스라서 필요가 없음 
			menuDto.setMenuNameKor("감자탕");
			menuDto.setMenuNameEng("kamgatang");
			menuDto.setMenuType("한식");
			menuDto.setMenuPrice(10000);
			
			menuDao.insert(menuDto);
			log.debug("등록 완료");
		}

}
