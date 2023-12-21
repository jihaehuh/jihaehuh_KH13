package oop.inherit5;

public class HotPurifier extends Purifier{
	
	protected HotPurifier(String company, int price) {
		super(company, price);
		// TODO Auto-generated constructor stub
	}

	public void hot() {
		System.out.println("온수 1잔 추출");
	}

}
