package com.kh.spring17;



import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayApproveRequestVO;
import com.kh.spring17.vo.KakaoPayApproveResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest

public class KakaoPayTest06 {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Test
	public void test() throws URISyntaxException {
		//데이터 준비 -KakaoPayApproveRequestVO
		KakaoPayApproveRequestVO requestVO = KakaoPayApproveRequestVO.builder()
				.tid("T60e32cb4510678bc60a")
				.partnerOrderId("22e3b8d4-681a-4579-b42e-336b1a7445ac")
				.partnerUserId("testuser1")
				.PgToken("28fb2325c26ea6e73467")
				.build();
		
		//처리
		KakaoPayApproveResponseVO responseVO = kakaoPayService.approve(requestVO);
		log.debug("responseVO={}",responseVO);
		
		//결과 출력-KakaoPayApproveRequestVO
				
	}
}
