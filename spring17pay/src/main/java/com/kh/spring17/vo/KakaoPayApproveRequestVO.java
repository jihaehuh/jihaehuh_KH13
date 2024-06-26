package com.kh.spring17.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//카카오페이 승인 요청을 보내기 위한 정볼를 담는 VO 
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class KakaoPayApproveRequestVO {
		private String tid;
		private String partnerOrderId;
		private String partnerUserId;
		private String PgToken;

}
