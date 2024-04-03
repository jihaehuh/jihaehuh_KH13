package com.kh.spring12;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MimeMessageTest01 {

	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() throws MessagingException {
//		SimpleMailMessage message = new SimpleMailMessage();
		//MimeMessage 는 여러가지 옵션을 설정할 수 있는 메세지
		
		//메세지 객체 생성
		MimeMessage message = sender.createMimeMessage();
		
		//도우미 객체 생성- 파일 전송은 안하고  UTF-8로 변환해서 전송하겠다 
		MimeMessageHelper helper = new MimeMessageHelper(message,false,"UTF-8");  //booleanMartipart, String encoding 있는 거 선선택하기
	
		//헬퍼에 정보를 설정
		helper.setTo(new String[] {"jihaehuh@naver.com"}); //여러개 메일 적어도 된다 갯수
		helper.setSubject("오늘의 운세");//제목
//		helper.setText("<h1>오늘 운세 너무 좋아요!</h1>"); //이렇게 쓰면 h1이 안먹힘
//		helper.setText("<h1>오늘 운세 너무 좋아요!</h1>",true); //이렇게 쓰면 h1이 먹힘  - HTML허용 설정 
	
		//(주의) 발송되는 이메일에 들어갈 HTML 디자인은 전부다 인라인으로 작성 
	    //- 내 디자인은 다른 사람꺼에선 적용이 안되서 
		StringBuffer buffer = new StringBuffer();
		//문자열에 태그 쓰는거 진짜 안좋은 방법 
		buffer.append("<div style='padding:20px; border:1px solid black'>"); //너무 복잡... 안좋은 방법
		buffer.append("<h1> 당신의 오늘의 운세 </h1>");
		buffer.append("<p>");
		buffer.append("운세가 너무 좋아요!");
		buffer.append("</p>");
		buffer.append("</div>");
		
		helper.setText(buffer.toString(),true);
		
		//전송
		sender.send(message);
	}
}
