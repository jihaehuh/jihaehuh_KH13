/*Test02성인인증
사용자의 생년월일 8자리를 변수에 저장한 뒤 이 사람이 성인인지 판정하여 출력하도록 구현하는 프로그램을 만드세요

예시 생년월일 : 20020507

성인은 한국 나이로 20세 이상일 경우를 말합니다
(연도만으로 나이를 계산합니다)
*/


/*
 * package data4;

public class Test02성인인증 {
	public static void main(String[]args) {
		//입력 
		int adult=20020101;        
		int age= 20020507;
		
		//계산
		boolean result = age >= adult; //                 int age = 22;
																			
		//출력
		System.out.println("성인 = "+ result);           System.out.println(true); 
		
	}
}
*/


package data4;

import java.time.LocalDate;   //프로그램한테 알려주는 역할

public class Test02성인인증 {
	public static void main(String[]args) {
		//입력 
		int birth =20050719;                          
		
		//계산
		LocalDate current = LocalDate.now();         
		int Year = current.getYear();
		
		int birthYear = birth/10000;
		
		int age = Year - birthYear +1;
		boolean adult = age >= 20;
		
	
		
		//출력
		System.out.println("현재 연도: " + Year);
		System.out.println("나이 :" + age );
		System.out.println("성인인가요? " + adult);
		
	}
}







