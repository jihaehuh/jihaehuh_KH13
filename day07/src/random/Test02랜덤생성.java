/*
 * Test02랜덤생성
다음 제시된 값을 생성해보세요

-로또번호 1개를 추첨한 결과
-두자리 정수 중 한 개를 추첨한 결과
-6자리 OTP 번호 한 개를 생성한 결과
-동전의 앞/뒤 중 하나를 생성한 결과
-가위/바위/보 중 하나를 생성한 결과

로또는 45개중에 6개
 */
package random;

import java.util.Random;

public class Test02랜덤생성 {
	public static void main(String[]args) {
		Random r =new Random(); //도구 생성
		//int number =r.nextInt(개수)+시작수;
		
		//로또
		int lotto =r.nextInt(45)+1; //1부터 45개 
		System.out.println("로또 = "+lotto);
		//정수
		int num =r.nextInt(99)+10;//10부터 99개
		System.out.println("두자리 정수 = "+num);
		//otp
		int otp =r.nextInt(900000)+100000;  // 100000부터999999개
		System.out.println("otp = "+otp);
		//동전 //Random은 문자열을 만들 수 없다. (약속 -앞(1) 뒤(2))  
		//int coin =r.nextInt(2)+1;     //1부터 2개 
		//숫자를 0,1로 해도 괜찮다,
		int coin =r.nextInt(2);   //0부터 2개
		if(coin==1) {  //1일때 앞
			System.out.println("앞");
		}
		else {    //0일때 뒤
			System.out.println("뒤");
		}
		
		//가위바위보
		//int game =r.nextInt(3)+1;
		int game =r.nextInt(3);   //0,1,2   0부터 3개
		/*if(game ==0) {
			System.out.println("가위");
		}
		else if(game ==1) {
			System.out.println("바위");
		}
		else {
			System.out.println("보");
		}
		*/
		switch(game) {
		case 0:
			System.out.println("가위");
		case 1 :
			System.out.println("바위");
		case 2 :
			System.out.println("보");
			break;
		}
	}
}
