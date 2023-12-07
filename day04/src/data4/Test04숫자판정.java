/*
Test04숫자판정
어떤 두 자리 숫자가 주어졌을 때
이 숫자에 7이 포함되어 있는지 검사하여 결과 출력

int number = 71;

위와 같은 상황이라면 true가 나와야 합니다.
참고로 자바에서 같다는 ==를 사용합니다

*/
package data4;

public class Test04숫자판정 {
	public static void main(String[]args) {
		
		//입력
		
		int number = 71;
		
		//계산
		//- 논리에서는 말이 되는 것이 중요하다
		//-7이 들어있는 숫자는 무엇인가?
		//10의 자리가 7 또는 1의 자리가 7
		//70부터 79사이 또는 1의 자리가 7 
		
		boolean ten = number/10 ==7;    //10의자리가 7?
		//boolean ten = number >=70 && number <80;
		boolean one = number % 10 ==7;
		//boolean seven = ten && one ; //둘다 7 인가요? 1개
		boolean seven = ten || one;  //둘중 하나가 7 인가요? 19개
		
		//출력
		System.out.println("숫자 7 이 있나요? "+seven);
		
		
		
		
		
	}
}
