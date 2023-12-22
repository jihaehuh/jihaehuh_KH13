package oop.inherit8;
//최상위 클래스_추상클래스
public abstract class Phone {
	//필드
	//메소드+(추상메소드)
	//셍성자
	
	  private  String number;
	  private String color;
	  
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//생성자
	public Phone(String number,String color) {
		this.setNumber(number);
		this.setColor(color);
	}
	//메소드+(추상메소드)
	public final void show() { //final로 재정의 못하게 함
		System.out.println("<휴대 전화 정보>");
		System.out.println("전화번호 : " + this.number);
		System.out.println("색상 : "+this.color);
	}
	//메소드  //기능은 있는데 쓸 내용은 없을때 추상메소드 만들기
	public abstract void call() ;  
	public abstract void sms();
	 

	
}
