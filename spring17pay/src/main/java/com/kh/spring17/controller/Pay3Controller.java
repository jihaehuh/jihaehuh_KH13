package com.kh.spring17.controller;


import java.net.URISyntaxException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring17.dao.ProductDao;
import com.kh.spring17.dto.ProductDto;
import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayApproveRequestVO;
import com.kh.spring17.vo.KakaoPayApproveResponseVO;
import com.kh.spring17.vo.KakaoPayReadyRequestVO;
import com.kh.spring17.vo.KakaoPayReadyResponseVO;
import com.kh.spring17.vo.PurchaseListVO;
import com.kh.spring17.vo.PurchaseVO;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/pay3")  //공용주소 
public class Pay3Controller {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping("/purchase")
	public String purchase(Model model) {
		model.addAttribute("list", productDao.selectList());
//		return "/WEB-INF/views/pay1/purchase.jsp";
		return "pay3/purchase";
	}
	@PostMapping("/purchase")
	public String purchase(
			/* @RequestParam int no, */ HttpSession session ,@ModelAttribute PurchaseListVO vo) throws URISyntaxException {
		//상품명과 가격을 알기 위해 DB조회
//		ProductDto productDto = productDao.selectOne(no);
		log.debug("size={}",vo.getPurchase().size());
		log.debug("vo={}",vo);
		
		//vo의 purchase 목록을 이용하여 결제 정보를 생성하는 코드 
		StringBuffer name = new StringBuffer();  //문자열더해야해서 
		int total = 0;
		
		
		
		//가격
	//	for(PurchaseVO purchaseVO : vo.getPurchase()) { //구매이력을 반복하며
			for(int i=0; i < vo.getPurchase().size(); i++) {   //일반 반복문사용 (이름을 넣어야해서 바꿈)
				PurchaseVO purchaseVO = vo.getPurchase().get(i);
				ProductDto productDto =productDao.selectOne(purchaseVO.getNo()); //productDao에서 상품 번호 조회
				
				if(i==0) {//이름은 한번만 나오도록 조건을 걸어야한다(i 가 0일때) 
					name.append(productDto.getName()); 
				}
				total += productDto.getPrice() * purchaseVO.getQty(); //총합 = productDto.가격  * purchaseVO.수량 
		}
			//구매 목록이 2개 이상이라면 "외 N건" 이라는 글자를 추가
			if(vo.getPurchase().size() >= 2) {
				name.append("외");
				name.append(vo.getPurchase().size()-1);  //구매갯수는 -1 
				name.append("건");
			}
			
			log.debug("결제 이름 = {} ",name);
			log.debug("결제 금액 = {} ",total);
		
		
			//결제 준비 요청 - KakaoPayReadyRequestVO, KakaoPayReadyResponseVO
			KakaoPayReadyRequestVO requestVO = 
					KakaoPayReadyRequestVO.builder()
						.partnerOrderId(UUID.randomUUID().toString())
						.partnerUserId("testuser1")
						.itemName(name.toString())
						.totalAmount(total)
					.build();
			
			KakaoPayReadyResponseVO responseVO = 
													kakaoPayService.ready(requestVO);
			
			//세션에 Flash Attribute를 추가
			session.setAttribute("partner_order_id", requestVO.getPartnerOrderId());
			session.setAttribute("partner_user_id", requestVO.getPartnerUserId());
			session.setAttribute("tid", responseVO.getTid());
			
			return "redirect:"+responseVO.getNextRedirectPcUrl();//결제페이지 안내
		

		
//		Vo를 만들어서 아래 코드가 필요없어짐 
//		//만약 productDto 가 null이라면 예외 발생 혹은 중단 
//		
//		KakaoPayReadyRequestVO requestVO =
//				KakaoPayReadyRequestVO.builder()
//					.partnerOrderId(UUID.randomUUID().toString())
//					.partnerUserId("testuser1")
//					.itemName(productDto.getName()) //위에서 불러온 DB를 이용해서 값 불러오기
//					.totalAmount(productDto.getPrice())
//				.build();
//		
//		KakaoPayReadyResponseVO responseVO = kakaoPayService.ready(requestVO);
//		
//		//세션에 Flash Attribute를 추가
//				session.setAttribute("partner_order_id", requestVO.getPartnerOrderId());
//				session.setAttribute("partner_user_id", requestVO.getPartnerUserId());
//				session.setAttribute("tid", responseVO.getTid());
//				
//				return "redirect:"+responseVO.getNextRedirectPcUrl();
//		
//		//session 에 flash attribute를 추가 
////		return "redirect: 구매페이지";
	}
	@GetMapping("/purchase/success")
	public String success(HttpSession session, @RequestParam String pg_token) throws URISyntaxException{
		KakaoPayApproveRequestVO requestVO = 
				KakaoPayApproveRequestVO.builder()
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
		
		//DB에 결제완료된 내역을 저장 
		//-결제 대표 정보 (payment)
		//-결제 상세 내역 (payment_detail)
		
		
		
		return "redirect:successComplete";
	}
	
	@GetMapping("/purchase/successComplete")
	public String successComplete(){
		return"pay2/successComplete";
	}
	
	
//	@GetMapping("/purchase/cancle")
//	@GetMapping("/purchase/fail")
}
