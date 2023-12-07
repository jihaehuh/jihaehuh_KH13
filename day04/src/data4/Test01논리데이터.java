package data4;

public class Test01논리데이터 {
	public static void main(String[]args) {
		//논리
		//-판정을 위한 데이터
		//-True/False 두 가지만 가질수 있다
		//-형태종류도 boolean 하나뿐이다
		
		boolean a = true;
		//boolean a= 1; 이건 안됨
		boolean b = false;
		System.out.println(a);
		System.out.println(b);
		
		//(ex) 가진돈이 28000원이고, 피자가 20000원이면 주문이 가능한가?
		int money =28000;
		int pizza =20000;
		boolean order = money >= pizza; //머니가 피자 이상이냐?
		System.out.println("order = "+ order); 
	}
}
