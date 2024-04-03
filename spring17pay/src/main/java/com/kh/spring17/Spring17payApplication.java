package com.kh.spring17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Spring17payApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring17payApplication.class, args);
	}

}
