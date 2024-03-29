package com.kh.spring14;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest01 {

	@Autowired
	private EmpDao empDao;
	
	//등록
	@Test
	public void test() {
		EmpDto empDto = new EmpDto();
		//번호는 시퀀스라서 필요가 없음 
		empDto.setEmpName("테스트 사원");
		empDto.setEmpDept("테스트");
		empDto.setEmpDate("2024-03-01");
		empDto.setEmpSal(500000);
		
		empDao.insert(empDto);
		log.debug("등록 완료");
	}
}
