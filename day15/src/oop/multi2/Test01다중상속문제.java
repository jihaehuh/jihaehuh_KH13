package oop.multi2;

public class Test01다중상속문제 {
	public static void main(String[] args) {
		//생성 가능한 모든 객체의 기능 테스트
		Drone a = new Drone();
		a.on();
		a.fly();
		a.move();
		a.off();

		Airplane b = new Airplane();
		b.fly();
		b.move();
		b.reservation();

		Train c = new Train();
		c.move();
		c.reservation();

		Bus d = new Bus();
		d.move();

		Kickboard e = new Kickboard();
		e.on();
		e.move();
		e.off();
	}
}


//정리 : 할수 있는것들을 만드는 것이 interface 이고
//그것들을 class 에서implements로 받는것이다









