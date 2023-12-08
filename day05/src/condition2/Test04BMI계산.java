/*
Test04체질량계산기
과거에 만들었던 BMI 계산기에 다음 기준에 따라 판정 구문을 추가해보세요

18.5 미만 저체중
18.5 이상 23미만
23이상 25미만
25이상 30미만 경도비만
30이상 중증도 비만


bmi = 체중/키



package condition2;

import java.util.Scanner;

public class Test04BMI계산 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		//입력       키 /나이
		System.out.println("키 : ");
		double cm =sc.nextDouble();
		System.out.println("몸무게 : ");
		double kg =sc.nextDouble();
		//출력     
		double m =cm /100;
		double bmi =kg/(m*m);
		double totalbmi=bmi;
		if(totalbmi >18.5) {
			System.out.println("BMI가 18.5미만입니다.");
		  }
		else if(totalbmi>23) {
			System.out.println("BMI가 18.5 이상 23미만입니다.");
		}
		else if(totalbmi >25) {
		  System.out.println("BMI가  23이상 25미만입니다.");
		}
		else if(totalbmi  >30) {
			System.out.println("BMI가  25이상 30미만 경도비만입니다.");
		}
		else {
			System.out.println("BMI가  30이상 중증도 비만입니다.");
		}
		
		
		
		
		
		/*double cm =180;
		double kg =80;
		double m =cm /100;
		double bmi =kg/(m*m);
		//double bmi =kg/m/m;
		
		System.out.println(bmi);
		*/
/*
	package condition2;

public class Test04BMI계산 {
	public static void main(String[] args) {

		//입력
		float cm = 180f;
		float kg = 80f;

		//계산
		float m = cm / 100;
		float bmi = kg / (m * m);

		//String status = "저체중" or "정상" or "과체중" or "경도비만" or "중등도비만";
		String status;
		if(bmi < 18.5f) {
			status = "저체중";
		}
		else if(bmi < 23f) {
			status = "정상";
		}
		else if(bmi < 25f) {
			status = "과체중";
		}
		else if(bmi < 30f) {
			status = "경도비만";
		}
		else {
			status = "중등도비만";
		}

		//출력
		System.out.println("BMI 지수 = " + bmi);
		System.out.println("당신의 상태 = " + status);
	}
}*/
package condition2;

import java.util.Scanner;

public class Test04BMI계산 {
	public static void main(String[] args) {

		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("신장 입력 : ");
		float cm = sc.nextFloat();
		System.out.print("체중 입력 : ");
		float kg = sc.nextFloat();

		//계산
		float m = cm / 100;
		float bmi = kg / (m * m);

		//String status = "저체중" or "정상" or "과체중" or "경도비만" or "중등도비만";
		String status;
		if(bmi < 18.5f) {
			status = "저체중";
		}
		else if(bmi < 23f) {
			status = "정상";
		}
		else if(bmi < 25f) {
			status = "과체중";
		}
		else if(bmi < 30f) {
			status = "경도비만";
		}
		else {
			status = "중등도비만";
		}

		//출력
		System.out.println("BMI 지수 = " + bmi);
		System.out.println("당신의 상태 = " + status);
	}
}













