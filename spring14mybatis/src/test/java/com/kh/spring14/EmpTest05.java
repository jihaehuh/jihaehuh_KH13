package com.kh.spring14;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest05 {

	@Autowired
	private EmpDao empDao;
	
	//삭제 
	//-지우고 싶은 번호를 넣고 지워라 하기 
	@Test
	public void test() {
		int empNo=50;
		if(empDao.delete(empNo)) { 
			log.debug("삭제 성공");
		}
		else {
			log.debug("존재하지 않는 대상");
		}
		
		
	}
}
