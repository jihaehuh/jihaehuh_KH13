package oop.inherit5;
//첫번째 만들기
public class Purifier {
	
	//필드
	private String company;
	private int price;
	
	//메소드
	public void setCompany(String company) {
		switch (company) {
		case "코웨이":
		case "SK 매직":
		case "쿠쿠":
		}
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	
	//메소드
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price <0) return;
		this.price = price;
	}
	//생성자
		//set 생성자,price 생성자
		//-(참고) protected의 "우리"란 개념엔" 패키지 + 상속 그룹"이 포함 (헷갈리면 public 사용)
		protected Purifier(String company,int price) {
				this.setCompany(company);
				this.setPrice(price);
			}
		
	//메소드
	public void normal() {  //재정의를 허락할지 말지 선택해야함 _ final을 붙일지 말지 ...
		System.out.println("정수 1잔 추출");
	}
	
}
