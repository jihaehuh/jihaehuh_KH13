package oop.nulti1;



/*
 * 인터페이스(interface)
 * -다중 상속 전용 클래스
 * -다중 상속에 문제가 되는 모든 부분이 제거된 클래스
 * 
 */

public interface Singer {
	
	//필드 -변수 생성 불가
	int a =10;
	//메소드 -추상메소드만 가능(1.8부터 default메소드도 가능)
	//public void sing();
	//public abstract void sing();
	void sing(); //형식을 빠르게 잡아쥰다
	
	//생성자-만들수 없다
	//*추상메소드만 가능하다~
}
