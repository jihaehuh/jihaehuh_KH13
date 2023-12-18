package oop.method6;

public class Product {
	//멤버 변수(필드)
	String name;
	String type;
	int price;
	boolean early;
	boolean event;

	//멤버메소드
	void data(String name, String type, int price) {
//		this.name = name;
//		this.type = type;
//		this.price = price;
//		this.early = false;
//		this.event = false;
		this.data(name, type, price, false, false);
	}
	//(주의) 구분되지 않는 상황은 오버로딩이 불가능하다
	//void data(String name, String type, int price, boolean early) {}
	void data(String name, String type, int price, boolean event) {
//		this.name = name;
//		this.type = type;
//		this.price = price;
//		this.early = false;
//		this.event = event;
		this.data(name, type, price, false, event);
	}
	void data(String name, String type, int price, boolean early, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.early = early;
		this.event = event;
	}

	void information() {
		System.out.println("<상품 정보>");
		System.out.println("상품명 : " + this.name);
		System.out.println("상품분류 : " + this.type);

		if(this.event) {
			int discount = this.price * 90 / 100;
			System.out.println("판매가 : "+discount
							+"원 (원가 "+this.price+"원, 10% 할인 행사중)");
		}
		else {
			System.out.println("판매가 : " + this.price+"원");
		}

		if(this.early) {
			System.out.println("* 새벽배송 상품은 2500원의 배송비가 추가됩니다 *");
		}
	}
}
	
	
