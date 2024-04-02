package com.kh.spring16;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EncryptTest05 {

	@Test
	public void test() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String input ="Hello world";
		String db ="$2a$10$5aWXjggrC4xZ6Dovcvx2ouR7CbBBQVfY1EsU8o/pIxvgs.j65sf.y";
		
		
		//암호화를 알아서 해줬기때문에 비교도 알아서
		//반드시 encoder 사용
		//왼쪽: row password  ( 날것 아무것도 안거친 패스워드 )  오른쪽: encoded( 고쳐진 패스워드) **순서조심** 
		boolean isValid  = encoder.matches(input, db);
		log.debug("isValid = {} ",isValid);
	}
	
}
