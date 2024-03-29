package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.MenuDao;
import com.kh.spring14.dto.MenuDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MenuTest05 {
	
	@Autowired
	private MenuDao menuDao;
	//삭제 
	//-지우고 싶은 번호를 넣고 지워라 하기 
	@Test
	public void test() {
		int menuNo=3;
		if(menuDao.delete(menuNo)) {
			log.debug("삭제 성공");
		}
		else {
			log.debug("존재하지 않는 대상");
		}
	}

}
