package com.kh.spring17.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown =true) 
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class KakaoPayApproveResponseVO {

	private String aid;//요청 고유 번호 - 승인/취소가 구분된 결제번호
	private String tid;//결제 고유 번호 - 승인/취소가 동일한 결제번호
	private String cid;//가맹점 코드
	private String sid;//정기 결제용 ID, 정기 결제 CID로 단건 결제 요청 시 발급
	
	private String PartnerOrderId;//가맹점 주문번호, 최대 100자
	private String partnerUserId;//가맹점 회원 id, 최대 100자
	private String paymentMethodType;//결제 수단, CARD 또는 MONEY 중 하나
	private KakaoPayAmountVO  amount;//결제 금액 정보
	private KakaoPayCardInfoVo cardInfo;//결제 상세 정보, 결제 수단이 카드일 경우만 포함
	private String itemName;//상품 이름, 최대 100자
	private String itemCode;//상품 코드, 최대 100자
	
	private int  quantity;//상품 수량
	private String createdAt;//결제 준비 요청 시각
	private String approvedAt;//결제 승인 시각
	private String payload;//결제 승인 요청에 대해 저장한 값, 요청 시 전달된 내용
	
	
}
