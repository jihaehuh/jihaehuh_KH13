package com.kh.spring12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MimeMessageTest04 {

	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() throws MessagingException, IOException {
//		SimpleMailMessage message = new SimpleMailMessage();
		//MimeMessage 는 여러가지 옵션을 설정할 수 있는 메세지
		
		//메세지 객체 생성
		MimeMessage message = sender.createMimeMessage();
		
		//도우미 객체 생성- 파일 전송은 안하고  UTF-8로 변환해서 전송하겠다 
		MimeMessageHelper helper = new MimeMessageHelper(message,true,"UTF-8");  
		//booleanMartipart, String encoding 있는 거 선택하기
		//- boolean 을 쓰는 이유: 첨부파일 여부, encoding쓰는 이유: 글자 깨지지 않게하기 위해
	
		
		
		//헬퍼에 정보를 설정
		helper.setTo(new String[] {"jihaehuh@naver.com"}); //여러개 메일 적어도 된다 갯수
		helper.setSubject("오늘의 운세");//제목

		//내용을 외부 파일에서 불러와 전송하도록 구현 
		//파일 찾기 
		//- src 가 왜 4개? ---java,resources,test = classpath , src --filepath(기본값) 
		ClassPathResource resource = new ClassPathResource("templates/email-template2.html");
		File target = resource.getFile(); //파일 추출
		
		StringBuffer buffer = new StringBuffer(); //문자열 합성 도구 생성
		Scanner sc = new Scanner(target); //파일을 읽을 수 있는 도구 생성
		while(sc.hasNextLine()) { //읽을 수 있는 줄이 남아 있다면 반복하여 실행 
			buffer.append(sc.nextLine()); //한줄을 읽어 buffer에 추가
		}
		sc.close();
		
		//읽은 내용을 HTML로 해석해서 필요한 정보를 교체한 뒤 전송
		//- Jsoup 필요 (썸머노트) - pom.xml에 Html읽는 도구 
		
		Document document = Jsoup.parse(buffer.toString()); //HTML로 해석
		Element receiver = document.getElementById("receiver"); //#receiver 탐색
		receiver.text("허지혜님");
		
		Element link = document.getElementById("move-link"); //#move-link 탐색
		link.attr("href", "https://www.google.com");
		
		helper.setText(document.toString(),true); //변환된 내용을 전송
		
		//첨부파일 추가 
		ClassPathResource attach1 =
				new ClassPathResource("static/image/back.jpg");
		ClassPathResource attach2 =
				new ClassPathResource("static/image/user.jpg");
		//helper.addAttachment("이름",리소스);
		helper.addAttachment(attach1.getFilename(),attach1);
		helper.addAttachment(attach2.getFilename(),attach2);
		
		
		//전송
		sender.send(message);
	}
}
