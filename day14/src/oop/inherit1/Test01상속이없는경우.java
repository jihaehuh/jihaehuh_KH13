package oop.inherit1;

public class Test01상속이없는경우 {	
	public static void main(String[]args) {
		//각각의 휴대폰을 하나씩 생성해서 사용가능한 모든 메소드 호풀
		GalaxyFold5 p1 =new GalaxyFold5();
		
		p1.call();
		p1.sms();
		p1.bixby();
		
		IPhone15 p2 =new IPhone15();
		p2.call();
		p2.sms();
		p2.siri();
	}
	//겹치는 부분을 다 사라지게 하고 각자 안겹치는것만 만들어놓고
	//다른곳에 겹치는 것을 몰아서 다 만들어놓고 거기서 상속 받는다 
}
