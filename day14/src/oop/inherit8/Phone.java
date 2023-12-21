package oop.inherit8;
//상위 클래스
public abstract class Phone {
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
	public void information() {
		System.out.println("전화번호 : " + this.number);
	}
	//메소드 
	public abstract void call() ;  
	public abstract void sms();
	 

	
}
