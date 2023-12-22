package oop.inherit8;

public class IPhone15 extends IPhone{

	public IPhone15(String number, String color) {
		super(number, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void siri() {
		System.out.println("IPhone15 음성인식 기능 실행");
		
	}

	@Override
	public void call() {
		System.out.println("아이폰15 전화기능 실행");
		
	}

	@Override
	public void sms() {
		System.out.println("아이폰15 문자기능 실행");
		
	}

	public void faceTime() {
		System.out.println("IPhone15 영상통화 기능 실행");
		
	}

	
}


