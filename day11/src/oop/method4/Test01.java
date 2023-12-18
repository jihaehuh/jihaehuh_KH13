package oop.method4;

public class Test01 {
	public static void main(String[] args) {

		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();

		a.data("아메리카노", "음료", 2500, true);
		b.data("모카라떼", "음료", 3500, false);
		c.data("치즈케이크", "디저트", 5000, true);
		d.data("마카롱", "디저트", 3000, false);

		a.information();
		b.information();
		c.information();
		d.information();

	}
}