
/*
 Test07윤년판정
윤년은 날짜 계산상의 오차를 메꾸기 위해 하루를 더 부여한 해를 말합니다. 

실제 1년은 365.24... 일입니다.
365일로 1년을 정하고 지내다 보면 시간이 틀어집니다.
다음과 같이 날짜를 추가하는 규칙을 세웁니다.
4년마다 1일씩 추가합니다.
100의 배수가 될 경우는 윤년이 아니라고 간주합니다.
400년마다 400의 배수여도 윤년이라고 간주합니다.

어떤 연도가 주어졌을 때 (ex : 2100) 윤년인지 판정하여 출력
 */

/*
package data4;

public class test07윤년 {
	public static void main(String[]args) {
		//입력
		int year =2100;
		int cycle =4;
		//계산
		/*
		 [1] 4의 배수인가요?    
		 [2] 100의 배수인가요?
		 [3] 400의 배수인가요?
		 
		 결론 = 4의 배수 이고 100의 배수가 아니여야하고 
		 400의 배수 이면서 100의 배수 여야함 
		 */
/*
		boolean leapyYear1 = year %  cycle ==0 && year % 100 !=0;          //4의 배수여야한다 && 100의 배수가 아님;
		boolean leapYear2 = year % 400 ==0 &&  year % 100 ==0;     //400의 배수&& 100의 배수임
		boolean resultYear = 	leapyYear1&& leapYear2;                      // 연도 1 && 연도 2 를 모두 만족하는가?
				
		//출력
		System.out.println("연도는 ?"+ year+"년");
		System.out.println("윤년인가 ?"+resultYear);
	}
}
*/
package data4;

public class test07윤년 {
	public static void main(String[]args) {
		//입력
		int year =2100;
		
		//계산
		//- 4의 배수이면서 100의 배수는 아니여야함 
		//- 400의 배수이고 100의 배수여도 = || or 이랑 같음 무조건 일단 F
		boolean condition1 =  year % 4==0;        //year가 4의 배수?;
		boolean condition2 =  year % 100!=0;     //year가 100의 배수가 아닌가?;
		boolean condition3 =  year % 400==0;    //year가 400의 배수?;
		
		boolean leap = condition3 || (condition1 && condition2);
		
		//출력
		System.out.println("윤년인가요?"+leap );
		
		
		
		
		
		
		
		
		
	}
}






















