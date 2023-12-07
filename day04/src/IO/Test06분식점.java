/*
Test06분식점
KH분식점의 메뉴판은 다음과 같습니다.

사용자에게 떡볶이, 튀김, 순대 개수를 입력받아 결제금액을 출력
(단, 현재 행사중이라서 10% 할인된 가격으로 판매합니다) 
떡볶이 3000원
튀김 500원
순대 2000원
*/

package IO;

import java.util.Scanner;//백준 자바 11

public class Test06분식점 {
	public static void main(String[]args) {
		//입력 
		int ddeokbokiPrice=3000;
		int friedPrice =500;
		int soondaePrice =2000;
		//떡볶이, 튀김, 순대 개수 입력 받기 
		Scanner sc =new Scanner(System.in);
		
		System.out.print("떡볶이 수량: ");
		int ddeokbokiNum =sc.nextInt();
		System.out.print("튀김 개수: ");
		int friedNum =sc.nextInt();
		System.out.print("순대 수량: ");
		int soondaeNum =sc.nextInt();
		
		//계산 
		//합계에서 10퍼센트 할인 가격
		int sum =(ddeokbokiPrice * ddeokbokiNum) 
				 +(friedPrice * friedNum )
				 +( soondaePrice * soondaeNum);
		int saleSum = sum-(sum /10);
		
		
		//결제 금액 출력
		System.out.print("총" + saleSum+ "원 입니다.");
		
		
		
	}
}
