package data2;

public class test06페이지번호계산기 {
	public static void main(String[]args) {
		
		//입력
		int myP =275;
		//	271~280   (270~279)
		int firstN = 1;
		int lastN = 10;
		//계산
		int firstR = (myP-1) /10*10+firstN;
		int lastR = (myP-1) /10*10+lastN;
		// 출력
		System.out.println(firstR);
		System.out.println(lastR);
	
		
	}
}
