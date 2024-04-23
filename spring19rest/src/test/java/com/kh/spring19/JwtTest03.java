package com.kh.spring19;

import java.nio.charset.StandardCharsets;

import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring19.configuration.JwtProperties;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class JwtTest03 {

	@Autowired
	private JwtProperties jwtProperties;
	
	
	
	@Test
	public void test() {
		//생성된 토큰 정보
		String token="eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJLSGFjYWRlbXkiLCJpYXQiOjE3MTM4NjAwNzUsImV4cCI6MTcxMzg4MTY3NSwibG9naW5JZCI6InRlc3R1c2VyMSIsImxvZ2luTGV2ZWwiOiLsnbzrsJjtmozsm5AifQ.nRppS29ItLmZX9aDmv2Eoz5EXZWQJdr2dmk9F_2HPwo";

		//1. 해석을 위한 키(key) 생성
		String keyStr=jwtProperties.getKeyStr();
		SecretKey key = Keys.hmacShaKeyFor(keyStr.getBytes(StandardCharsets.UTF_8));
		
		//2. 토큰해석
		Claims claims = (Claims) Jwts.parser() //해석 도구(parse)준비해서 -(claims추가 필요)
				.verifyWith(key)//열쇠 설정하고
				
				.requireIssuer(jwtProperties.getIssuer()) //발행자 정보를 확인하도록 (properties에서 발행자 부르기) 
				// ---2번과 3번의 토큰이 같아서 발행자에서 오류가 안나지만 1번은 토큰이 달라서 발행자에서 오류가 남 
				
				.build()//만든다음
				.parse(token)//토큰 해석하고
				.getPayload(); //내용 가져와!
		
		//3. 정보출력
		log.debug("loginId={}",claims.get("loginId"));
		log.debug("loginLevel={}",claims.get("loginLevel"));
		log.debug("test={}",claims.get("test"));
		
	}
	
}