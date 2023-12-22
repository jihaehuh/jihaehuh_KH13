package oop.inherit8;

public class GalaxyFold5 extends Galaxy{

	public GalaxyFold5(String number, String color) {
		super(number, color);
		
	}

	@Override
	public void samsungPay() {
		System.out.println("갤럭시 Fold5의 삼성 페이 기능 실행");
		
	}

	@Override
	public void call() {
		System.out.println("갤럭시 Fold5의 삼성 페이 기능 실행");
		
	}

	@Override
	public void sms() {
		System.out.println("갤럭시 Fold5의 삼성 페이 기능 실행");
		
		}
		
	public void iris() {
		System.out.println("갤럭시 Fold5의 홍채인식 기능 실행");
		
	}
}
