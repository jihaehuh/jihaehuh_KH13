package oop.method2;

public class Test01 {
	public static void main(String[]args) {
		//멤버 변수 (필드) -이 객체가 가져야 하는 데이터를 정의
		
		//멤버 메소드 - 이 객체가 가지면 좋은 코드를 정의
		 Player p1 =new Player();
		 Player p2 =new Player();
		 Player p3 =new  Player();
		
		
		p1.data("김종오","사격","하계 ",4, 2, 0);
		p2.data("김수녕","양궁","하계", 4, 2, 1);
		p3.data("김수녕","양궁","하계", 4, 2, 1);
		
		p1.information(); 
		p2.information();
		p3.information();
	}
}
