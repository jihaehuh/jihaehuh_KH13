package com.kh.spring14;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.MenuDao;
import com.kh.spring14.dto.MenuDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MenuTest03 {
	
	@Autowired
	private MenuDao menuDao;
	
	//상세
		@Test
		public void test() {
			int menuNo=3;
			MenuDto menuDto = menuDao.selectOne(menuNo);
			log.debug("menuDto ={}",menuDto);
		}

}