package com.kh.spring17;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.extern.slf4j.Slf4j;

//approve 주소 조심 
@Slf4j
@SpringBootTest
public class KakaoPayTest03 {
//신버전 
	@Test
	public void test( ) throws URISyntaxException, JsonProcessingException {
		//카카오페이 서버에 결제 준비(ready) 요청을 보내보자!
		//신버전 코드(카카오페이 개발자센터가 따로 생김)
		
		//요청 전송 도구 생성
		RestTemplate template = new RestTemplate();
		
		//주소 생성
		URI uri = new URI("https://open-api.kakaopay.com/online/v1/payment/approve");
		
		//헤더 생성
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "SECRET_KEY DEVCD03A1B726628E74D2D0AB3BC029B2E94F972");
		header.add("Content-Type", "application/json");
		
		//바디 생성
		Map<String, String> body = new HashMap<>();
		body.put("cid", "TC0ONETIME");
		body.put("tid", "T60e067c4510678bc547");
		body.put("partner_order_id","63576b9d-e021-4dd3-827e-1c11dea44c3a");
		body.put("partner_user_id", "testuser1");
		body.put("pg_token", "d5a7e9c1b74ed3359dae");
		
		
//		POST /online/v1/payment/approve HTTP/1.1
//		Host: open-api.kakaopay.com
//		Authorization: SECRET_KEY ${SECRET_KEY}
//		Content-Type: application/json
		
		
		//통신 요청
		HttpEntity entity = new HttpEntity(body, header);//헤더+바디
		
		Map response = template.postForObject(uri, entity, Map.class);
		log.debug("partner_order_id={}",body.get("partner_order_id"));
		log.debug("partner_user_id={}",body.get("partner_user_id"));
		log.debug("거래번호(tid) ={}",response.get("tid"));
		log.debug("주소 = {}", response.get("next_redirect_pc_url"));
	}
	
}