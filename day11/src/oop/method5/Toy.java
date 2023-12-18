package oop.method5;

public class Toy {
	//멤버 변수(필드)
	String name;
	int price;
	boolean event;    //boolean의 기본값은 false임
	//멤버 메소드
	
	void data(String name,int price) {
		this.name=name;
		this.price =price;
		this.event=false;  
	}
	
	//이름이 같으면 안된다고 배웠는데 이제부터는 이름이 같아도 가능해졌다
	//메소드 오버로딩 
		//-같은 이름으로 여러개의 메소드를 만드는 것
		//-뭘 좋아하는지 몰라서 다 준비해봤오
		//매개변수가 달라서 구분이 가능한 경우만 인정한다
	void data(String name,int price, boolean event) {
		this.name=name;
		this.price =price;
		this.event=event;
	}
	void information() {
		System.out.println("<장난감 정보>");
		System.out.println("이름 : "+ this.name);
		System.out.println("가격 : "+ this.price +"원");
		System.out.println("행사 : "+this.event);
	}
	
}
