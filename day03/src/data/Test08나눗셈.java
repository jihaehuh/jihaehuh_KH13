/*
 * Test09만나이
오늘은 2023년 12월 6일입니다
2000년 1월 1일 생의 만나이를 구하여 출력하세요

단, 생년월일은 20231206 처럼 8자리의 숫자형태로 제공됩니다
단, 일은 고려하지 않고 월까지만 고려합니다. 

1.변수를 생성합니다.
-int current = 20231206;
-int birth = 20000101;
2.변수에 저장된 정보 중 연, 월을 추출합니다.
3.추출한 정보를 가장 작은단위로 변환하여 개월 수를 계산합니다.
4.개월 수를 이용하여 만나이를 계산합니다.
 */

package data;

public class Test08나눗셈 {
	public static void main(String[]args) {
		int number=75;
		
		//위 숫자의 10의 자리 ,1의 자리 숫자를 각각 출력
		
		//System.out.println(number / 10);
		//System.out.println(number % 10);
		
		//숫자의 100의 자리,10의자리,1의 자리를 각각 출력
		int number2 =139;
		System.out.println(number2 / 100);
		System.out.println(number2 / 10 %10);
		System.out.println(number2 %10);
		
		
		
		
		
		
	}
}
