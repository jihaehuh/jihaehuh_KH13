package data;
 //(Q) 떡볶이가 1인분에 3500원, 튀김이 1인분에 2000원일때 
 // 떡볶이 4인분, 튀김2인분을 주문하면 얼마인가요?
public class Test02분식집 { 
	public static void main(String[] args) {
		// [1] 내가 다계산함.
		//System.out.println(18000); 
		
		//[2] 컴퓨터에게 식으로 계산을 시켜 결과를 출력
		//System.out.println(14000 + 4000);
		//System.out.println(3500*4 + 2000*2); //괄호를 사용해서 우선순위를 정해줘도 좋음
		
		
		//[3] 각각의 합계와 총 금액을 출력
		//System.out.println(3500*4);
		//System.out.println(2000*2);
		//System.out.println(3500*4 + 2000*2);
		
		//[4] 계산 결과를 '변수'에 저장한 뒤 출력
		//int a = 3500 * 4;
		//int b = 2000 * 2;
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(a+b);
		
		//[5] 모든 수치를 변수로 관리하여 계산 및 출력(최종)
		
		//입력 부분
		 int ddeokboki = 3500;  // 떡볶이 1인분  값
		 int fried = 2000; // 튀김 1인분 값
		 int ddeokbokiCount =  4;
		 int friedCount= 2;
		 
		 //결과 계산 값 부분
		 int ddeokbokiTotal = ddeokboki * ddeokbokiCount;
		 int friedTotal = fried * friedCount;
		 int Total = ddeokbokiTotal + friedTotal;
		 
		 //출력 부분
		 System.out.println(ddeokbokiTotal);
		 System.out.println(friedTotal);
		 System.out.println(Total);
	}
}
