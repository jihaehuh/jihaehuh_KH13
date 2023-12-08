/*
 * Test04여행사
KH여행사에서는 다음과 같은 슬로건을 걸고 영업을 하고 있습니다.
어디든 무조건 1사람 1박에 10만원

여름 매출이 너무 저조해서 여름에 여행하는 사람은 추가로 20%할인 행사를 진행합니다.

사용자에게 인원수, 기간(일), 예정(월)을 입력받아서 예상 금액을 구하여 출력
(단, 여름은 6,7,8월입니다)
 */

package condition;

import java.util.Scanner;

public class Test04여행사 {
	public static void main(String[] args) {
		//입력 - 1사람 1박에 10만원    인원수,기간(일) ,예정(월)
		Scanner sc =new Scanner(System.in);
		System.out.println("인원수: ");
		int people =sc.nextInt();
		
		System.out.println("기간: ");
		int day =sc.nextInt();
		
		System.out.println("월: ");
		int month =sc.nextInt();
		
		int cost = 100000;
		
		
		//계산 - 여름엔 20% 할인        할인액=원래가격×(할인율/100)
		//boolean summer =6<= month <= 8;       //6이상 8이하 만 20프로 할인 
		boolean summer = 6  <= month && month <=8;	
		//boolean summer =month /3 ==2;
		
		//출력	
		if (summer) {
			int total1 = (int) (((people * day )* cost)-(cost*0.2)); //0.8을 곱하거나 20/100하기    
			System.out.println("여름에 여행가시네요? 할인대상이세요");
			System.out.println("요금은  "+ total1  +"원");
		}
		else {
			int total2 = people * day * cost;		// 그외는 else 처리
			System.out.println("아쉽지만 행사 대상은 아닙니다.");
			System.out.println("요금은  "+ total2  +"원");
		}	
	}
}
