package com.kh.spring14;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest03 {

	@Autowired
	private EmpDao empDao;
	//상세
	@Test
	public void test() {
		int empNo=5;
		EmpDto empDto = empDao.selectOne(empNo);
		log.debug("empDto ={}",empDto);
	}
}
