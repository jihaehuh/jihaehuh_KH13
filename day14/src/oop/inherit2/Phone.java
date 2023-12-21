package oop.inherit2;

public class Phone {
	//"휴대전화"의 공통점을 모아둔 추상적인 클래스
		//공통 필드- "휴대전화"라면 있어야하는 필드
	private String number; //휴대전화 라면 전화번호가 있어야지
	private String color;//휴대전화라면 색상이 있어야지

	//공통 메소드- "휴대전화라면 있어야하는 기능
	public void call() { //휴대전화라면 전화기능이 있어야지
		System.out.println("전화기능");
		
	}
	public void sms() {//휴대전화라면 문자 기능이 있어야지
		
		System.out.println("문자기능");
		
	}
	
}
