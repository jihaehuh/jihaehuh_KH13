package com.kh.spring12;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring12.service.EmailService;

@SpringBootTest
public class SendMailTest03 {

	@Autowired
	private EmailService emailService;
	
	@Test
	public void test() {
		emailService.sendWelcomeMail("zzezze1109@gmail.com");
	}
	
}