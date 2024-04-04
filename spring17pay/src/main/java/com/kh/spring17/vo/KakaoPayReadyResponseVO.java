package com.kh.spring17.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//카카오페이 준비요청이  완료 되었을 때 카카오 페이에서 보내주는 정보를 담을 VO
//카카오페이가 보내주면 자동으로 생성되어야함 -JSON 변환 설정 추가
@JsonIgnoreProperties(ignoreUnknown =true) 
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class KakaoPayReadyResponseVO {
	private String tid;//결제 고유 번호 (20자)
	private String nextRedirectMobileUrl;//모바일 웹용 결제 페이지 주소
	private String nextRedirectPcUrl; //PC용 결제 페이지 주소
	private String createdAt;//결제 준비 요청 시각
	
}
