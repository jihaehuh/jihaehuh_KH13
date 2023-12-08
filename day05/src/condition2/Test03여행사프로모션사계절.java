/*package condition2;

import java.util.Scanner;

public class Test03여행사프로모션사계절 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//입력
		//할인과 관련된 데이터
		System.out.print("여행가는 달(1~12) 입력 : ");
		int month = sc.nextInt();

		//금액과 관련된 데이터
		System.out.print("인원 수 입력 : ");
		int people = sc.nextInt();
		System.out.print("여행 기간(일) 입력 : ");
		int day = sc.nextInt();
		int price = 100000;

		//계산
		boolean spring = month ==3 || month == 4 || month == 5;
		boolean summer = month == 6 || month == 7 || month == 8;
		boolean fall = month == 9 || month == 10|| month == 11;
		boolean winter = month == 12 || month == 1 || month == 2;
		//출력
		if(spring) {
			int total = people * day * price;//원래금액
			int discount = total * 20 / 100;//할인금액
			int result = total - discount;//예상금액
			System.out.println("어머! 봄에 여행가시네요?");
			System.out.println("예상 금액 = " + total + "원");
			System.out.println("할인 금액 = " + discount + "원");
			System.out.println("최종 금액 = " + result + "원");
		}
		else if(summer){
			int total = people * day * price;//원래금액
			int discount = total * 10 / 100;//할인금액
			int result = total - discount;//예상금액
			System.out.println("어머! 여름에 여행가시네요?");
			System.out.println("예상 금액 = " + total + "원");
			System.out.println("할인 금액 = " + discount + "원");
			System.out.println("최종 금액 = " + result + "원");
		}
		else if(fall){
			int total = people * day * price;//원래금액
			int discount = total * 10 / 100;//할인금액
			int result = total - discount;//예상금액
			System.out.println("어머! 가을에 여행가시네요?");
			System.out.println("예상 금액 = " + total + "원");
			System.out.println("할인 금액 = " + discount + "원");
			System.out.println("최종 금액 = " + result + "원");
		}
		else{
			int total = people * day * price;//원래금액
			int discount = total * 10 / 100;//할인금액
			int result = total - discount;//예상금액
			System.out.println("어머! 겨울에 여행가시네요?");
			System.out.println("예상 금액 = " + total + "원");
			System.out.println("할인 금액 = " + discount + "원");
			System.out.println("최종 금액 = " + result + "원");
		}
	}
}
*/
package condition2;

import java.util.Scanner;

public class Test03여행사프로모션사계절 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//입력 
		System.out.println("월: ");
		int month = sc.nextInt();
		
		System.out.println("일: ");
		int day =sc.nextInt();
		
		System.out.println("사람: ");
		int people =sc.nextInt();
		
		int price=100000;
		//계산
		//int rate= 20,10,30,50;        month ==3 || month == 4 || month == 5
		int rate;
		if(month ==3 || month == 4 || month == 5) {
			rate =20;
		}
		else if(month ==6 || month == 7 || month == 8) {
			rate=10;
		}
		else if(month ==9 || month == 10 || month ==11) {
			rate=30;
		}
		else {
			rate =5;
		}
		//금액 계산
		//총금액 = 인원수 *기간*하루금액
		//할인금액 = (인원수 *기간 *하루금액)*할인율
		int total =people *day *price;
		int discount = total *rate /100;
		int result =total -discount;
		
		
		
		//출력
		System.out.println("총 금액 :"+ total + "원");
		System.out.println("할인율 : "+ rate + "%");
		System.out.println("결제 금액 : "+ result + "원");
	}
}
