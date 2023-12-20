package oop.keyword4;

//이 클래스는 별도의 멤버 필드를 가지지 않고 일회성 계산 메소드만 보관
public class Robot {
	
	//1. 11의 제곱을 구할 수 있도록 square 메소드 구현
	
	public static double square(int number) {
		return number * number;
	}
	//2. 폭이 5, 높이가 7인 삼각형의 넓이를 구할 수 있도록 triangle 메소드 구현
	public static double triangle(double width,double height) {
		return (width * height )/2;
	}
	//3. 반지름이 5인 원의 넓이를 구할 수 있도록 circle 메소드 구현
	public static double circle(int radius) {
		//return (radius *radius) *3.14;
		return square(radius)*3.14;
	}
	//4. 출생년도 4자리를 집어넣으면 지하철 요금이 계산되도록 subway 메소드 구현
	
	public static int subway(int birth) {
		//성인(20세이상 65세 미만) : 1400원
		int age =2023- birth+1;
		if(age >=65 || age <8) {
			return 0;
		}
		else if(age >=20) {
			return 1400;
			
		}
		else if(age >=14) {
			return 800;
		
		}
		else {
			return 500;
		}
	}
	//5. 연도 4자리를 집어넣으면 윤년인지 아닌지 판정하는 leap 메소드 구현
	public static boolean leap(int year) {
		boolean judge = year %400 ==0 || ( year %4 ==0 && year %100 != 0);
		return judge;
	}
	
	//6. 키(cm)와 몸무게(kg)를 집어넣으면 체질량지수(BMI)를 구하는 bmi 메소드 구현
	public static double bmi(double height,double weight) {
		double m =height /100;
		return weight / (m *m);
	}
}
