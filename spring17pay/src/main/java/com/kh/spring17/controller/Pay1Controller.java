package com.kh.spring17.controller;

import java.net.URISyntaxException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayApproveRequestVO;
import com.kh.spring17.vo.KakaoPayApproveResponseVO;
import com.kh.spring17.vo.KakaoPayReadyRequestVO;
import com.kh.spring17.vo.KakaoPayReadyResponseVO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/pay1")  //공용주소 
public class Pay1Controller {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@GetMapping("/purchase")
	public String purchase() {
//		return "/WEB-INF/views/pay1/purchase.jsp";
		return "pay1/purchase";
		
	}
	@PostMapping("/purchase")
	public String purchase(@ModelAttribute KakaoPayReadyRequestVO requestVO,HttpSession session) throws URISyntaxException {
		requestVO.setPartnerOrderId(UUID.randomUUID().toString());
		requestVO.setPartnerUserId("testuser1");
		
		KakaoPayReadyResponseVO responseVO = kakaoPayService.ready(requestVO);
		
		//세션에 flash attribute 를 추가 
		session.setAttribute("partner_order_id", requestVO.getPartnerOrderId());
		session.setAttribute("partner_user_id", requestVO.getPartnerUserId());
		session.setAttribute("tid", responseVO.getTid());
		
		return "redirect:"+responseVO.getNextRedirectPcUrl(); //카카오결제 페이지로 다시 돌아가게 만들기 
	
	}
	//결제 성공처리 페이지
	@GetMapping("/purchase/success")
	public String success(@RequestParam String pg_token ,HttpSession session) throws URISyntaxException { //세션 필요함
		//승인 요청 받기위해 필요한 VO 
		//받을 친구들
		KakaoPayApproveRequestVO requestVO = KakaoPayApproveRequestVO.builder()
				.partnerOrderId((String) session.getAttribute("partner_order_id"))
				.partnerUserId((String) session.getAttribute("partner_user_id"))
				.tid((String) session.getAttribute("tid"))
				.PgToken(pg_token)
				.build();
		
		
		//세션의 Flash Attribute 를 제거
		//-이유: 한번밖에 못씀...
		session.removeAttribute("partner_order_id");
		session.removeAttribute("partner_order_id");
		session.removeAttribute("tid");
		
		KakaoPayApproveResponseVO responseVO = kakaoPayService.approve(requestVO);
		
		
//		return "redirect:사용자에게 보여줄 결제 완료 페이지";
		return "redirect:successComplete";
		//결제페이지에서 pg토큰 꺼내야함
	}
	@GetMapping("/purchase/successComplete")
	public String successComplete() {
		return "pay1/successComplete";
	}
	
	//결제 취소처리 페이지
//	@GetMapping("/purchase/cancel")
	
	//결제 실패처리페이지
//	@GetMapping("/purchase/fail")
	
	
	
}
