package oop.modifier3;

public class Test01 {
	public static void main(String[] args) {
		Telecom p1 = new Telecom();
		Telecom p2 = new Telecom();
		Telecom p3 = new Telecom();
		Telecom p4 = new Telecom();

		p1.data("갤럭시 Fold 4", "SK", 1800000);
		p2.data("갤럭시 Fold 4", "KT", 1750000, 24);
		p3.data("아이폰15", "LG", 2000000, 30);
		p4.data("아이폰15", "SK", 1990000);

		p1.information();
		p2.information();
		p3.information();
		p4.information();
	}
}