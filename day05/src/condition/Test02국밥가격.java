/*Test02국밥가격
KH국밥집에서는 국밥 한그릇을 7천원에 팔고 있습니다.
65세 이상 어르신에게는 30% 할인된 가격으로 판매합니다.

사용자에게 출생년도 8자리를 입력받아 한국나이 계산 후 
주문할 수량을 입력받아 결제할 금액 출력 
*/

/*package condition;


import java.util.Scanner;

public class Test02국밥가격 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		//입력
		int kookbap =7000;
		int sale =30;
		int birth =19850203;
		
		System.out.print("나이: ");
		int ageNum=sc.nextInt();
		System.out.print("국밥 주문수량: ");
		int kookbapCount=sc.nextInt();
		
		
		int ageNum =2023 - birth +1;
		boolean slaeAge =ageNum >=65;
		//계산 - 국밥가격, 나이, 할인된가격
		int kookbapSaleCost = (kookbap*kookbapCount) -(kookbap/sale);
		int saleAge =current- age;
		
		int age =2023 - birth +1;
		boolean 
		
		if (agenum) {
			System.out.println("30%할인이 됩니다.");
		}
		
		//출력
		
	}
}
*/
package condition;
import java.util.Scanner;

public class Test02국밥가격 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		//입력
		System.out.println("생년월일: ");
		int birth =sc.nextInt();
		System.out.println("주문 수량: ");
		int count =sc.nextInt();
		
		int price =7000;
		int rate =30;
		
		//계산
		// 65세 미만인지 아닌지 구하기
		int year = birth /10000;
		int age =2023-year+1;
		//LocalDate currentDate = LocalDate.now();

		boolean discount = age >=65;
		
		
		
		
		//출력 -영역이 달라서 변수가 같아도 상관없다.
		if(discount) {/*65세 이상이라면 할인대상*/
			int total =price*count*(100-rate)/100;//0.7
			System.out.println("가격: "+total+"원");
		}
		else/*if(65세 미만이라면*/ {
			int total =price*count;
			System.out.println("가격: "+total +"원");
		}
	}
}



















