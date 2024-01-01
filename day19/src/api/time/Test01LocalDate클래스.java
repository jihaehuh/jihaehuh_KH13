package api.time;

import java.time.LocalDate;
import java.time.Period;

public class Test01LocalDate클래스 {
	public static void main(String[] args) {
		
		//Local Date 클래스는 날짜만을 사용하고자 할때 쓴다
		//1. 기존에 비해 메소드의 의미가 명확해짐
		//2. 월 설정을 1~12월로 할 수 있다
		//3. 객체가 불변 처리된다.
		
		LocalDate a = LocalDate.now(); //현재 날짜 
		LocalDate b = LocalDate.of(2024, 1, 1); //2024-01-01
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		//항목 추출(연/월/일)
		System.out.println(a.getYear());
		System.out.println(a.getMonthValue());
		System.out.println(a.getDayOfMonth());
		
		//윤년 _leap Year
		System.out.println(a.isLeapYear()); //a가 윤년입니까?
		System.out.println(b.isLeapYear());	//b가 윤년입니까?
		
		//날짜계산
		//(Q) 수료 30일 전부터 프로젝트를 시작할 예정입니다. 날짜를 구하세요
		LocalDate finish = LocalDate.of(2024, 5, 20);
		LocalDate project =finish.minusDays(30);	//굉장히 직관적으로 구할 수 있게 구현되어있음
		System.out.println("project = " + project);
		
		//오늘은 수료 며칠 전입니까?
		//-finish 와 a의 차이를 구하세요랑 같은 말
		//-주인공이 애매해진다...
		//-주인공이 애매해서 별도의 클래스로 계산하게 되어있다
		Period period = Period.between(a, finish);
		System.out.println(period.getYears());	//남은 연도	
		System.out.println(period.getMonths());	//남은 개월수
		System.out.println(period.getDays());	//남은 일수 
	}
}
