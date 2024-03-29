package com.kh.spring14;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.MenuDao;
import com.kh.spring14.dto.MenuDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MenuTest02 {
	
	@Autowired
	private MenuDao menuDao;
	
	//목록 
		//-개수
		@Test
		public void test() {
			List<MenuDto> list =menuDao.selectList();
			
			log.debug("결과 수 : {}",list.size());
		}

}
