package oop.inherit8;

public class GalaxyFold5 extends Phone {

	public GalaxyFold5(String number, String color) {
		super("01086564454", "블루");
	
	}
	public void call() {
		System.out.println("GalaxyFold5 전화기능");
	}
	
	public void sms() {
		System.out.println("GalaxyFold5 문자기능");
	}
	public void samsungPay() {
		System.out.println("GalaxyFold5 기능 실행");
	}
	public void bixby() {
		System.out.println("GalaxyFold5 음성 인식 기능 실행");
	}

}
