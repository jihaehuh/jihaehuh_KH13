package com.kh.spring17;

import java.net.URISyntaxException;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayReadyRequestVO;
import com.kh.spring17.vo.KakaoPayReadyResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest

public class KakaoPayTest05 {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Test
	public void test() throws URISyntaxException {
		//값을 이제 미리 지정해주기
				KakaoPayReadyRequestVO requestVO = KakaoPayReadyRequestVO.builder()
						.partnerOrderId(UUID.randomUUID().toString())
						.partnerUserId("testuser1")
						.itemName("자바 평생 무료 수강권")
						.totalAmount(9900)
						.build();
				
				//결제 준비 요청
				KakaoPayReadyResponseVO responseVO = kakaoPayService.ready(requestVO);
				log.debug("requestVO={}",requestVO);
				log.debug("responseVO={}",responseVO);
				
	}
}
