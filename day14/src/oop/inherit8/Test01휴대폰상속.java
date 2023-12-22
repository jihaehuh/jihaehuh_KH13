package oop.inherit8;

public class Test01휴대폰상속 {
	public static void main(String[] args) {
		/*
		Galaxy23FE p1 = new Galaxy23FE("01011112222", "블랙");
		GalaxyFold5 p2 = new GalaxyFold5("01022223333", "실버");
		IPhone14 p3 = new IPhone14("01033334444", "로즈핑크");
		IPhone15 p4 = new IPhone15("01044445555", "네츄럴티타늄");
		*/
		Galaxy p1 = new Galaxy23FE("01011112222", "블랙");
		GalaxyFold5 p2 = new GalaxyFold5("01022223333", "실버");
		IPhone p3 = new IPhone14("01033334444", "로즈핑크");
		Phone p4 = new IPhone15("01044445555", "네츄럴티타늄");
		//up-casting이라고 한다
		
		p1.show();
		p1.call();
		p1.sms();
		p1.samsungPay();
		//p1.bixby();  //갤럭시로 하면 디테일한 기술은 쓸 수 없어진다...

		p2.show();
		p2.call();
		p2.sms();
		p2.samsungPay();
		p2.iris();

		p3.show();
		p3.call();
		p3.sms();
		p3.siri();
		//p3.itunes();  //아이폰으로 하면 디테일한 기술 사용못함
		
		// 폰으로 했을때
		p4.show();
		p4.call();
		p4.sms();
		//p4.siri();   폰으로 했을때 고유기능이 사용불가된다 
		//p4.faceTime();
		//갤럭시는 갤럭시 두 기종도 가능하지만 폰도 가능하구 아이폰은 불가능하다
		
	}
}
