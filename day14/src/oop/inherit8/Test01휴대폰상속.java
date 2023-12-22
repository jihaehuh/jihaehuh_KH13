package oop.inherit8;

public class Test01휴대폰상속 {
	public static void main(String[] args) {
		Galaxy23FE p1 = new Galaxy23FE("01011112222", "블랙");
		GalaxyFold5 p2 = new GalaxyFold5("01022223333", "실버");
		IPhone14 p3 = new IPhone14("01033334444", "로즈핑크");
		IPhone15 p4 = new IPhone15("01044445555", "네츄럴티타늄");

		p1.show();
		p1.call();
		p1.sms();
		p1.samsungPay();
		p1.bixby();

		p2.show();
		p2.call();
		p2.sms();
		p2.samsungPay();
		p2.iris();

		p3.show();
		p3.call();
		p3.sms();
		p3.siri();
		p3.itunes();

		p4.show();
		p4.call();
		p4.sms();
		p4.siri();
		p4.faceTime();
	}
}
