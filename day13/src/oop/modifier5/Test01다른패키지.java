package oop.modifier5;

import oop.modifier4.Car;

public class Test01다른패키지 {
	public static void main(String[]args) {
		//자바는 기본 범위가 패키지(package)이다.
		//같은 패키지가 아니면 import 필요
		
		//필드 프라이빗 나머지 퍼블릭
		Car c =new Car("소나타",150);
	}
}
