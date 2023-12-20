package oop.keyword4;


public class Test01 {
	public static void main(String []args) {
		
	
		System.out.println("11의제곱 : "+ Robot.square(11));
		
		System.out.println("삼각형 넓이 : "+ Robot.triangle(5,7));
		
		System.out.println("원 넓이 : "+Robot.circle(5));
		
		System.out.println("2000년생 지하철 요금 : "+ Robot.subway(2000));
		System.out.println("2000년은 윤년인가요? : "+ Robot.leap(2000));
		System.out.println("180/80의 BMI : "+ Robot.bmi(180,80));
	}
}
