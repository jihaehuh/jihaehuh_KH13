package oop.inherit8;

public abstract class Galaxy extends Phone{

	public Galaxy(String number, String color) {
		super(number, color);
		
	}
	//갤럭시 시리즈는 만들때 삼성페이가 있어야해 알고있어라~
	public abstract void samsungPay(); 

}
