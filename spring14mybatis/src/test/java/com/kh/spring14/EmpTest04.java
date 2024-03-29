package com.kh.spring14;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest04 {

	@Autowired
	private EmpDao empDao;
	
	//수정 
	//-등록 과 다른 점- 번호를 알려주고 바꾸고 싶은 정보를 넣어야함 
	@Test
	public void test() {
		EmpDto empDto = new EmpDto();
		empDto.setEmpNo(2);
		empDto.setEmpName("테스트");
		empDto.setEmpDept("테스트");
		empDto.setEmpDate("2024-03-02");
		empDto.setEmpSal(500001);
		
		if(empDao.update(empDto)) {
			log.debug("정보변경 성공");
		}
		else {
			log.debug("존재 하지 않는 대상");
		}
	}
}
