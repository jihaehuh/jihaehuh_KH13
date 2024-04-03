package com.kh.spring17;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
public class KakaoPayTest01 {
    
	@Test
	public void test() throws URISyntaxException {
    	//카카오페이 서버에 결제 준비(ready)요청을 보내보자!
    	
    	//요청 전송 도구 생성 
		RestTemplate template = new RestTemplate();
    	
    	//주소 생성
//		URI uri = new URI("https://open-api.kakaopay.com/online/v1/payment/ready");
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
    	
    	//카카오 에이피아이에서 가져온 코드 
		/*
		 * POST /online/v1/payment/ready HTTP/1.1 Host: open-api.kakaopay.com
		 * Authorization: SECRET_KEY ${SECRET_KEY} Content-Type: application/json
		 */
    	
    	
    	
    	//헤더 생성
    	HttpHeaders header = new HttpHeaders();
//    	header.add("Authorization","SECRET_KEY be1f32c205cf1006429ae2ddad9314ad");
//    	header.add("Content-Type","application/json");
    	header.add("Authorization", "KakaoAK be1f32c205cf1006429ae2ddad9314ad");
    	header.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
    	
    	
    	//바디 생성 -10개를 보내야만 너는 요청을 보낼수 있다고 카카오에서 말함
    			MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
    			body.add("cid", "TC0ONETIME");//가맹점 번호
    			body.add("partner_order_id", UUID.randomUUID().toString());//주문번호/UUID-시리얼 번호 생성해주는거
    			body.add("partner_user_id", "thdustest1000");//사용자명
    			body.add("item_name", "초코파이 외 1개");//상품명
    			body.add("quantity", "1");//수량 (수량 문자열로 통신은 문자열로 밖에 안되자너)
    			body.add("total_amount", "4500");//가격
    			body.add("tax_free_amount", "0");//비과세
    			body.add("approval_url", "http://localhost:8080/success");//승인주소
    			body.add("cancel_url", "http://localhost:8080/cancel");//취소주소
    			body.add("fail_url", "http://localhost:8080/fail");//실패주소
    	
    	
    	
    	//통신 요청
    	//합체 순서  - 1. 헤더 + 바디 먼저
    			HttpEntity entity = new HttpEntity(body, header);//헤더 + 바디
    			
    	
//    	변수 = template.postForObject(uri, entity, 결과물의 형태 ); //결과물의 형태  는 클래스 또는 맵으로 만들어도 된다 
    			Map response = template.postForObject(uri, entity, Map.class);
//    			log.debug("response = {}", response);
    			log.debug("주소={}",response.get("next_redirect_pc_url"));
    }
    
}