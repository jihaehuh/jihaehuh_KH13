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
public class KakaoPayCardInfoVo {
	private String kakaopayPurchaseCorp; //카카오페이 매입사명
	private String kakaopayPurchaseCorpCode; //카카오페이 매입사 코드
	private String kakaopayIssuerCorp; //카카오페이 발급사명
	private String kakaopayIssuerCorpCode; //카카오페이 발급사 코드
	private String bin; //카드 BIN
	private String cardType; // 카드 타입
	private String installMonth; //할부개월수 
	private String approvedId; //승인 번호
	private String cardMid; //가맹점 번호
	private String interestFreeInstall; //무이자 할부 여부
	private String installmentType; //할부 유형
	private String cardItemCode; //카드 상품 코드 
	
}
