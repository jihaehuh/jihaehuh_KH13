//편의점에서 삼각김밥을 1+1으로 판매중입니다.
//아르바이트생은 여러분의 생각만큼 친절하지 않아서
//5개를 가져간다 한들 한 개 더 가져오면 공짜라는 말을 안합니다
//삼각김밥 한 개가 1200원이라고 할 때,
//삼각김밥 7개를 사면 
//(1) 몇 개가 공짜 처리되는지
//(2) 다 해서 얼마인지
//구해서 출력해보세요




package data;
public class Test05편의점 {
	public static void main(String[]args) {
		//입력 부분   -  김밥 가격,개수
		int Price = 12000;         //TriangleKimbabPrice= Price
		int Count =1;//TriangleKimbapCount =Count
		
		
		//계산 부분 (중간중간 출력값을 확인해도 좋음)
		int Free = Count/2; //공짜의 개수  TriangleKimbapFree=Free
		//System.out.println(TriangleKimbapFree);
		int Pay = Count -Free; 
		//System.out.println(Pay);
		int Total = Pay *Price;  //TriangleKimbapTotal=Total
		//System.out.println(TriangleKimbapTotal); //총 값
		
		
		//출력 부분  -  문제에서 요구하는 값을 화면에 출력
		System.out.println(Free+"개");
		System.out.println(Total+"원");
		
		//2+1은 3으로 나누면 된다.
		
		
	}
}
