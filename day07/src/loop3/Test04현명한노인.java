package loop3;

public class Test04현명한노인 {
	public static void main(String[]args) {
		
		
		long money =1;
		long total =0;
		
		for(int day =1; day<=40;day++) {  //날짜가 커지면 21억이 넘어가서 int대신 long으로 사용
			
			System.out.println(day+"일차 :  "+ money +"골드");
			total +=money;
			money *=2;  //2의 제곱수 _(다음날을 위한 사전 준비작업(제일 마지막에 있어야함)
		}
		System.out.println("총 수령 금액 :" +total +"골드");
	}
}
