package oop.inherit8;

public class IPhone14 extends Phone {

	public IPhone14(String number, String color) {
		super("010565215", "그린");
		
	}
	public void call() {
		System.out.println("아이폰14 전화기능");
	}
	
	public void sms() {
		System.out.println("아이폰14 문자기능");
	}
	public void facetime() {
		System.out.println("IPhone14 영상통화 기능 실행");
	}
	public void siri() {
		System.out.println("IPhone14 음성인식 기능 실행");
	}
}
