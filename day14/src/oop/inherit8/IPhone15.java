package oop.inherit8;

public class IPhone15 extends Phone{

	public IPhone15(String number, String color) {
		super("01080116907","화이트");
		
	}
	public void call() {
		System.out.println("아이폰15 전화기능 실행");
	}
	public void sms() {
		System.out.println("아이폰15 문자기능 실행");
	}
	public void facetime() {
		System.out.println("IPhone15 영상통화 기능 실행");
	}
	public void siri() {
		System.out.println("IPhone15 음성인식 기능 실행");
	}

	
}
