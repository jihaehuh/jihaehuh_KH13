package oop.poly1;

import java.util.Random;

public class Test01다형성의장점2 {
	public static void main(String[] args) {
		
		//랜덤으로 아이폰 14랑아이폰 15 중 하나를 추첨
		Random r = new Random();
		//약속 : 아이폰 14 (0번),아이폰 15(1번)
		
		int choice = r.nextInt(2);
		
		//IPhone14 phone; 이거는 14만 되서 안됨
		//Iphone15 phone; 이거는 15만 되서 안됨
		IPhone phone; //이라는 변수를 만들어서 아이폰14,15를 넣으면 된다
		
		if(choice ==0) {
			//아이폰 14객체 생성
			phone  = new IPhone14(); //IPhone14  ->IPhone (업 캐스팅)
		}
		else {
			//아이폰15객체 생성
			phone = new IPhone15();//IPhone15  ->IPhone (업 캐스팅)
		}
		phone.call();
		phone.sms();
		//문제 해결: 추첨된 휴대폰 객체를 알 수 있다.
	}
}
