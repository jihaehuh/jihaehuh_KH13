package com.kh.spring10.service;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kh.spring10.dao.CertDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.CertDto;
import com.kh.spring10.dto.MemberDto;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender sender;
	
	@Autowired
	private MemberDao memberDao;
	
	//가입 환영 이메일 발송
	public void sendWelcomeMail(String email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("[KH정보교육원] 가입을 환영합니다");
		message.setText("앞으로 많은 활동 부탁드립니다!");
		
		sender.send(message);
	}
	
	public void sendWelcomeMail(MemberDto memberDto) throws IOException, MessagingException {
		//리소스 불러오기
		ClassPathResource resource = new ClassPathResource("templates/welcome-template.html");
		File target = resource.getFile();
		
		StringBuffer buffer = new StringBuffer();
		Scanner sc = new  Scanner(target);
		while(sc.hasNextLine()) {
			buffer.append(sc.nextLine());
		}
		sc.close();
		
		Document document = Jsoup.parse(buffer.toString());
		Element who = document.getElementById("who");
		who.text(memberDto.getMemberNick());
		
		Element link = document.getElementById("login-link");
//		link.attr("href","https://localhoast:8080/member/login");//서버 pc에서만
//		link.attr("href","http://192.168.30.200:8080/member/login"); //강의장에서만 (집에서는 안됨)
		
		//주소를 상황에 맞게 생성하는 도구 -ServletUriComponentsBuilder
		link.attr("href", ServletUriComponentsBuilder
										.fromCurrentContextPath()
										.path("/member/login")
										.build().toUriString());
		
		//이미지
//		Element image = document.getElementById("back-img");
//		image.attr("src","/image/back.jpg");//주소에는 static 안들어감 
		//- 하지만 왜 안들어가죠...? 
		//이유: 코드가 잘못된것이 아니라 우리끼리 접속 가능한 주소로 해서 구글입장에서는 막아버리는거지... 
		Element image = document.getElementById("back-img");
		image.attr("src", ServletUriComponentsBuilder
								.fromCurrentContextPath()
								.path("/image/bg.jpg")
								.build().toUriString());
		
	
		//마임 메세지 생성
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,false,"UTF-8");
		
		helper.setTo(memberDto.getMemberEmail());
		helper.setSubject("[KH정보교육원 ] 가입을 환영합니다");
		helper.setText(document.toString(),true);
		
		sender.send(message);
		
	}
	
	
	//아이디 발송
	public boolean sendMemberId(String memberNick) {
		MemberDto memberDto = 
				memberDao.selectOneByMemberNick(memberNick);
		
		if(memberDto != null) {//존재하는 닉네임이라면
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(memberDto.getMemberEmail());
			message.setSubject("[KH정보교육원] 아이디 찾기 결과 안내");
			message.setText("당신의 아이디는 " + memberDto.getMemberId() + "입니다");
			sender.send(message);
			return true;
		}
		else {//존재하지 않는 닉네임이라면
			return false;
		}
	}
	
	//임시 비밀번호 발송
	public void sendTempPassword(MemberDto memberDto) {
		String lower = "abcdefghijklmnopqrstuvwxyz";//3글자
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//3글자
		String number = "0123456789";//1글자
		String special = "!@#$";//1글자
		
		Random r = new Random();//랜덤 도구
		StringBuffer buffer = new StringBuffer();//문자열 합성도구
		
		for(int i=0; i < 3; i++) {
			int pos = r.nextInt(lower.length());//lower에서의 랜덤위치
			buffer.append(lower.charAt(pos));//버퍼에 추가
		}
		for(int i=0; i < 3; i++) {
			int pos = r.nextInt(upper.length());//upper에서의 랜덤위치
			buffer.append(upper.charAt(pos));//버퍼에 추가
		}
		for(int i=0; i < 1; i++) {
			int pos = r.nextInt(number.length());//number에서의 랜덤위치
			buffer.append(number.charAt(pos));//버퍼에 추가
		}
		for(int i=0; i < 1; i++) {
			int pos = r.nextInt(special.length());//special에서의 랜덤위치
			buffer.append(special.charAt(pos));//버퍼에 추가
		}
		
		//생성한 비밀번호로 DB를 변경
		memberDto.setMemberPw(buffer.toString());//비밀번호 설정 후
		memberDao.updateMemberPw(memberDto);//변경 처리
		
		//이메일 발송
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(memberDto.getMemberEmail());
		message.setSubject("[KH정보교육원] 임시 비밀번호 안내");
		message.setText("임시 비밀번호는 " + memberDto.getMemberPw() + "입니다");
		
		sender.send(message);
	}
	
	@Autowired
	private CertDao certDao;
	
	//인증번호 발송 - 주어진 이메일에 무작위 6자리 숫자를 전송
	public void sendCert(String memberEmail) {
		Random r = new Random();
		int number = r.nextInt(1000000);//000000 ~ 999999
		DecimalFormat fmt = new DecimalFormat("000000");
		
		//메일 발송
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(memberEmail);
		message.setSubject("[KH정보교육원] 인증번호 안내");
		message.setText("인증번호는 [" + fmt.format(number) + "] 입니다");
		
		sender.send(message);
		
		//인증번호 저장 - 기존 내역 삭제 후 저장
		certDao.delete(memberEmail);
		CertDto certDto = new CertDto();
		certDto.setCertEmail(memberEmail);
		certDto.setCertNumber(fmt.format(number));
		certDao.insert(certDto);
	}
}