package oop.inherit8;

public abstract class IPhone extends Phone{

	public IPhone(String number, String color) {
		super(number, color);
	}
	//있어야하는데 뭐라쓸지 모를때 추상메소드를 사용(abstract)
	public abstract void siri(); 
}