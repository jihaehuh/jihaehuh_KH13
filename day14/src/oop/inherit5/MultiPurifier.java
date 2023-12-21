package oop.inherit5;

public class MultiPurifier extends Purifier {
	
	protected MultiPurifier(String company, int price) {
		super(company, price);
		// TODO Auto-generated constructor stub
	}
	public void cold() {
		System.out.println("냉수 1잔 추출");
	}
	public void hot() {
		System.out.println("온수 1잔 추출");
	}
}
