/*
 * 사용자에게 원하는 단을 입력받아서 구구단 문제를 내고 
정답을 입력받는 프로그램을 구현

구구단 : (3)

3 x 1 = (3)
정답!
3 x 2 = (5)
땡!
3 x 3 = (6)
정답!
...
3 x 9 = (27)
정답!

게임 끝!
 */
package loop;

import java.util.Scanner;

public class Test10구구단 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("구구단 : ");
			int num1 =sc.nextInt();
			
		
			for(int i =1;i <=9;i++) {
				System.out.println(num1 +"X"+i+"=");
				int total =sc.nextInt();
				//정답인지 아닌지 나와야함
				//계속 끝까지 실행되고 나가기
			}
	}
}
//int num1 =1,2,3,4,5,6,7,8,9;
//int num2 =1,2,3,4,5,6,7,8,9;		
//	int total =num1 *num2;
//System.out.println("total");