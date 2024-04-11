package com.kh.spring17.controller;


import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring17.dao.PaymentDao;
import com.kh.spring17.dao.ProductDao;
import com.kh.spring17.dto.PaymentDetailDto;
import com.kh.spring17.dto.PaymentDto;
import com.kh.spring17.dto.ProductDto;
import com.kh.spring17.service.KakaoPayService;
import com.kh.spring17.vo.KakaoPayApproveRequestVO;
import com.kh.spring17.vo.KakaoPayApproveResponseVO;
import com.kh.spring17.vo.KakaoPayCancelRequestVO;
import com.kh.spring17.vo.KakaoPayCancelResponseVO;
import com.kh.spring17.vo.KakaoPayOrderRequestVO;
import com.kh.spring17.vo.KakaoPayOrderResponseVO;
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
	
	@Autowired
	private PaymentDao paymentDao;
	
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
			
			//(+추가) 사용자가 구매한 상품번호와 수량목록을 결제 성공페이지로 전송
			session.setAttribute("vo", vo);
			//session.setAttribute("list", vo.getPurchase());
			
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
		
		//세션에 전송된 vo -구매목록을 꺼내서 DB에 저장 할 때 활용
		PurchaseListVO  vo =(PurchaseListVO) session.getAttribute("vo");
		session.removeAttribute("vo");
		
		//DB에 결제완료된 내역을 저장 
		//-결제 대표 정보 (payment) =번호 생성 후 등록
		int paymentNo = paymentDao.paymentSequence();
		PaymentDto paymentDto = PaymentDto.builder()
					.paymentNo(paymentNo) //시퀀스
					.paymentName(responseVO.getItemName()) //대표결제명
					.paymentTotal(responseVO.getAmount().getTotal())//결제 총금액
					.paymentRemain(responseVO.getAmount().getTotal()) //잔여금액
					.memberId(responseVO.getPartnerUserId()) //구매자 ID
					.paymentTid(responseVO.getTid()) //거래번호 
				.build();
		paymentDao.insertPayment(paymentDto);
		
		
		
		//-결제 상세 내역 (payment_detail)
		for(PurchaseVO purchaseVO : vo.getPurchase()) {
			ProductDto productDto =
					productDao.selectOne(purchaseVO.getNo()); //상품 정보 조회 
			
			int paymentDetailNo = paymentDao.paymentDetailSequence();
			
			PaymentDetailDto paymentDetailDto = PaymentDetailDto.builder()
					.paymentDetailNo(paymentDetailNo)  //시퀀스
					//.paymentDetailProduct(purchaseVO.getNo()) //상품번호
					.paymentDetailProduct(productDto.getNo()) //상품번호
					.paymentDetailQty(purchaseVO.getQty()) //수량
					.paymentDetailName(productDto.getName()) //상품명
					.paymentDetailPrice(productDto.getPrice()) //상품가격
					.paymentDetailStatus("승인") //결제 상태
					.paymentNo(paymentNo) //결제 대표 번호
					.build();
			paymentDao.insertPaymentDetail(paymentDetailDto);//등록 
			 
		}
		
		return "redirect:successComplete";
	}
	
	@GetMapping("/purchase/successComplete")
	public String successComplete(){
		return"pay2/successComplete";
	}
	
	//**결제 취소와 실패에서는 결제 준비시 세션에 담았던 FlashAttribute를 반드시 제거해야한다 **
	@GetMapping("/purchase/cancle")
	public String cancel(HttpSession session) {
		session.removeAttribute("partner_order_id");
		session.removeAttribute("partner_user_id");
		session.removeAttribute("tid");
		session.removeAttribute("vo");
		
		return "pay3/cancel";
	}

	@GetMapping("/purchase/fail")
	public String fail(HttpSession session) {
		session.removeAttribute("partner_order_id");
		session.removeAttribute("partner_user_id");
		session.removeAttribute("tid");
		session.removeAttribute("vo");
		
		return "pay3/fail";
	}
	
	//결제 목록 - 카카오페이 아니고 payment
    @RequestMapping("/list")
    public String list(Model model) {
    	model.addAttribute("list", paymentDao.paymentList());
        return "pay3/list";
    }
    
    @RequestMapping("/detail")
    public String detail(@RequestParam int paymentNo, Model model) throws URISyntaxException {
    
    	//forward  와 redirect의 차이점 
    	//- 전화 고객센터 전화를 걸었을때 잠시만 기다려주세요 - forward
    	//- 여기가 아니니까 다른곳으로 전화주세요 - redirect 
    	List<PaymentDetailDto> detailList = paymentDao.paymentDetailList(paymentNo);
    	model.addAttribute("detailList",detailList);
    	
    	
    	
    	//카카오 페이의 상세 조회 내역 첨부 
    	PaymentDto paymentDto = paymentDao.selectOne(paymentNo);
    	model.addAttribute("paymentDto", paymentDto);
    	KakaoPayOrderRequestVO requestVO =
    			  KakaoPayOrderRequestVO.builder()
                  .tid(paymentDto.getPaymentTid()).build();
    	KakaoPayOrderResponseVO responseVO =
    			kakaoPayService.order(requestVO);
    	
    	model.addAttribute("responseVO",responseVO);
    	return "pay3/detail";
    }
	
    //부분 취소 
    //-데이터베이스변경 + kakaoApI 취소 요청 
    //-데이터베이스는 payment_detail과 payment 조회 및 변경이 필요함 
    //- payment에서는 잔여금액을 차감하고 TID를 조회
    //- payment_detail 에서는 상품상태를 취소로 변경하고 금액을 조회해야함 
    //- payment의 status를 취소로 update 
    @GetMapping("/cancelItem")
	public String cancelItem(@RequestParam int paymentDetailNo) throws URISyntaxException {
		//[1] 결제 상세 정보를 모두 불러온다(취소시킬 금액을 알 수 있다)
		PaymentDetailDto paymentDetailDto = paymentDao.paymentDetailFind(paymentDetailNo);
		int amount = paymentDetailDto.getTotalPrice();
		
		
		
		//(+추가) 상품이 취소 상태라면 예외를 발생시켜 실행을 막는다
		if(paymentDetailDto.getPaymentDetailStatus().equals("취소")) {
			throw new RuntimeException("이미 취소 된 상품");
		}

		//[2] 결제 대표 정보를 모두 불러온다(거래번호와 잔여금액을 알 수 있다)
		PaymentDto paymentDto = 
				paymentDao.selectOne(paymentDetailDto.getPaymentNo());
		int paymentNo = paymentDto.getPaymentNo();
		int paymentRemain = paymentDto.getPaymentRemain();

//		if(paymentRemain < amount) {//잔여금액이 더 작은경우
//			return "redirect:에러페이지";
//		}

		//[3] 불러온 정보들을 이용하여 카카오페이 취소 요청을 한다(Test07)
		KakaoPayCancelRequestVO requestVO = 
										KakaoPayCancelRequestVO.builder()
											.tid(paymentDto.getPaymentTid())
											.cancelAmount(amount)
										.build();

		KakaoPayCancelResponseVO responseVO = 
										kakaoPayService.cancel(requestVO);

		//[4] 취소가 성공한 경우 데이터베이스 값을 변화시킨다
				paymentDao.paymentRemainDecrease(paymentNo, amount);
				paymentDao.paymentDetailCancel(paymentDetailNo);
				return "redirect:detail?paymentNo="+paymentNo;
    }
    
    
    //전체 취소
    //-결제 대표정보를 조회하여 남은 금액을 모두 취소하는것
    //- 결재 대표정보에 소속된 상세 정보의 상태를 모두 취소로 변경해야함 
    @GetMapping("/cancelAll")
    public String cancelAll(@RequestParam int paymentNo) throws URISyntaxException {
    	//[1] 결제 대표정보를 모두 불러온다 (잔여금액이 존재)
    	PaymentDto paymentDto = paymentDao.selectOne(paymentNo);
    	
    	//+(추가) 잔여금액이 0원이라면 차단
    	if(paymentDto.getPaymentRemain() == 0) {
    		throw new RuntimeException("이미취소 완료된 결제건");
    	}
    	//[2] 결제 취소 
    	KakaoPayCancelRequestVO requestVO =
    			KakaoPayCancelRequestVO.builder()
    			.tid(paymentDto.getPaymentTid())
    			.cancelAmount(paymentDto.getPaymentRemain())
    			.build();
    	
    	KakaoPayCancelResponseVO responseVO = kakaoPayService.cancel(requestVO);
    	
    	//[3] DB상태변경
    	//1. payment 테이블의 해당 항목 잔여금액 모두 차감 
    	//2. payment_detail 테이블의 해당 payment_no 에 대한 항목을 모두 취소 
    	paymentDao.paymentRemainDecrease(paymentNo, paymentDto.getPaymentRemain());
    	paymentDao.paymentDetailCancelAll(paymentNo);
    	return "redirect:detail?paymentNo="+paymentNo;
    }
	}
