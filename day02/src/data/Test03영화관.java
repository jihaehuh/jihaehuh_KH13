package data;

//(Q)영화관 요금표는 다음과 같습니다.
//성인 : 12000원
//청소년 : 8500원
//성인 2명과 청소년 2명의 요금을 구하세요.

public class Test03영화관 {
	public static void main(String[] args) {
		//입력 부분   -  문제에 주어진 값들을 변수에 저장
		int AdultPrice = 12000;
		int TeenagerPrice = 8500;
		int AdultCount = 2;
		int TeenagerCount = 2;
		
		//결과 계산값 부분 (중간중간 출력값을 확인해도 좋음)
		int AdultTotal = AdultPrice *AdultCount;
		//System.out.println(AdultTotal+"원");
		int TeenagerTotal = TeenagerPrice *TeenagerCount;
		//System.out.println(TeenagerTotal+"원");
		int Total = AdultTotal + TeenagerTotal;
		//System.out.println(Total+"원");
		
		//출력 값 부분  -  문제에서 요구하는 값을 화면에 출력
		System.out.println(Total+"원");
		
	}
}
