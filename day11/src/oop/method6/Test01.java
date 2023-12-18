package oop.method6;

public class Test01 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		p1.data("참이슬후레시", "주류", 1200, true, true);
		//p2.data("클라우드맥주", "주류", 3000, false, true);
		p2.data("클라우드맥주", "주류", 3000, true);
		//p3.data("바나나킥", "과자", 1500, false, true);
		p3.data("바나나킥", "과자", 1500, true);
		p4.data("허니버터칩", "과자", 2000, true, false);

		p1.information();
		p2.information();
		p3.information();
		p4.information();
	}
}

