package com.kh.spring17.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class KakaoPayCancelResponseVO {
	private String aid;//요청 고유 번호
	private String tid;//결제 고유번호, 20자
	private String cid;//가맹점 코드, 10자
	private String status;//결제 상태
	private String partnerOrderId;//가맹점 주문번호
	private String partneruserId;//가맹점 회원 id
	private String paymentMethodType;//결제 수단, CARD 또는 MONEY 중 하나
	private KakaoPayAmountVO amount;//결제 금액
	private KakaoPayAmountVO approvedCancelAmount;//이번 요청으로 취소된 금액
	private KakaoPayAmountVO canceledAmount;//누계 취소 금액
	private KakaoPayAmountVO cancelAvailableAmount;//남은 취소 가능 금액
	private String itemName;//상품 이름, 최대 100자
	private String itemCode;//상품 코드, 최대 100자
	private int  quantity;//상품 수량
	private Date createdAt;//결제 준비 요청 시각
	private Date approvedAt;//결제 승인 시각
	private Date canceledAt;//결제 취소 시각
	private String payload;//취소 요청 시 전달한 값
	
}
