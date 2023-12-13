/*
 * Test03랜덤구구단
10개의 랜덤 구구단 문제를 출제하는 프로그램을 구현하세요
-2단 부터 19단 까지의 범위 내에서 출제0
-사용자에게 입력을 받아 정답, 오답 판정0
-사용자가 맞춘 문제 수를 카운트하여 출력0
-맞춘 문제 하나당 점수를 부여0
-쉬운 문제는 10점 (2~11단, x1)
-어려운 문제는 15점 (나머지)
사용자가 획득한 점수를 누적합산하여 출력
 */

package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단 {
	public static void main(String[]args) {
		
		/*
		Random num =new Random(); 
		int danA =num.nextInt(18)+2; //2단부터 19단까지 A
		int danB =num.nextInt(9)+1;  //1부터 9까지B 
		int result =danA *danB;
		System.out.println(danA +"X"+danB+"="+result);
		*/
		
		Scanner sc =new Scanner(System.in);
		
		Random num =new Random(); 
		int total=0; //정답 개수 변수선언
		int score=1;
		int easy=0;
		int diff=0;
		
		for(int i=1; i <=10;i++) { //구구단 10개 뽑기
			int danA =num.nextInt(18)+2;
			int danB =num.nextInt(9)+1;
			System.out.println(danA +"X"+danB+"=");
			
			int answer =sc.nextInt();//정답 받기
			
			int result=danA *danB; //정답 유무 판정
			if (result != answer) {
				System.out.println("오답");
				continue;
			}
			
			System.out.println("정답");
			total ++;
			
			if(danA < 12) {//11단까지
				easy +=10;
			}
			else {
				diff +=15;
			}
		}
		
		System.out.println("어려운 문제 ="+diff+" 점" );
		System.out.println("쉬운 문제 ="+easy+ "점" );
		System.out.println("맞은 개수 = "+ total +"개" );
		
		System.out.println("총 점 = "+(diff+easy)+"점" );
	}
}

//System.out.println("어려운 문제 = "+  +"점" );
		//System.out.println("쉬운 문제 = "+ diff +"점" );
	
		//System.out.println(total+"점" );
		//개수 세기
		//점수 부여 
		//2-11단 10점씩 /12-19단은 15점
		//누적 합산