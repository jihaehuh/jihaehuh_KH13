/*
KH주차장은 10분당 1500원의 요금을 받고 있습니다.
처음 9분까지는 돈을 받지 않고 10분이 되면 1500원, 20분이 되면 3000원으로 요금이 올라갑니다

11시 50분에 들어와서 17시 25분에 나간 차량의 요금을 출력
(단, 다음날까지 주차는 절대로 불가능합니다)

*/
package data;

public class Test07주차장 {
	public static void main(String[]args) {
		
		//입력 부분
		int PkinH = 11 ,PkinM = 50;
		int PkoutH = 17 ,PkoutM = 25;
		int Price = 1500;
		
		//계산 부분
		
		int TotalTime = (PkoutH*60+PkoutM) - (PkinH*60+PkinM);
		int parkingPrice = (TotalTime/10)*Price;
		
		//출력 부분
		
		System.out.println("요금은 " + parkingPrice+"원 입니다.");
		
				
	}
}

