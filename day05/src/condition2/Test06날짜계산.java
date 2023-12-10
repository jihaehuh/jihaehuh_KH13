/*
 * Test06날짜계산
1월부터 12월은 각각 정해진 날짜 수가 존재합니다.
이를 일반적으로 큰달, 작은달로 표현합니다.

사용자에게 연도와 월을 입력받아 해당하는 달의 마지막 날짜가 몇일인지 구하여 
출력하세요.
큰달 - 31일까지 존재하는 달(1,3,5,7,8,10,12월)
작은달 - 30일 까지존재하는 달 (4,6,9,11월)
2월- 윤년일 경우 29일, 아닐 경우 28일 까지 존재
 */


package condition2;

import java.util.Scanner;

public class Test06날짜계산 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력해주세요: ");
		int year= sc.nextInt();
		System.out.println("월을 입력해주세요: ");
		int month= sc.nextInt();
		
		//입력
		
		//계산
		//- 4의 배수이면서 100의 배수는 아니여야함 
		//- 400의 배수이고 100의 배수여도 = || or 이랑 같음 무조건 일단 F
		boolean condition1 =  year % 4==0;        //year가 4의 배수?;
		boolean condition2 =  year % 100!=0;     //year가 100의 배수가 아닌가?;
		boolean condition3 =  year % 400==0;    //year가 400의 배수?;
		
		boolean leap = condition3 || (condition1 && condition2);
		
		int moon;
		if(month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			moon =31;
			System.out.println(month +" 월 의 마지막 날짜는" + moon+"입니다." );
		}
		
		else if(month ==4 || month == 6 || month == 9 || month == 11) {
			moon =30;
			System.out.println(month +" 월 의 마지막 날짜는" + moon+"입니다." );
		}
		else if(!leap){
			moon =28;
			System.out.println(month +" 월 의 마지막 날짜는" + moon+"입니다." );
		}
		else {
			moon =29;
			System.out.println(month +" 월 의 마지막 날짜는 윤년으로" + moon+"입니다." );
		}
		
		
	}
}
