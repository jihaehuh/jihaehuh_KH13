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
/*
package loop;

import java.util.Scanner;

public class Test10구구단 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("구구단 : ");
			int num1 =sc.nextInt();
			
		
			for(int i =1;i <=9;i++) {
				System.out.println(num1 +"X"+i+"=");
				
				int answer =sc.nextInt();
				boolean correct =num1*i==answer;
				//계산
				if(correct){
					System.out.println("정답");
				}
				else {
					System.out.println("땡");
				}
			}		
	}
}
*/
//int num1 =1,2,3,4,5,6,7,8,9;
//int num2 =1,2,3,4,5,6,7,8,9;		
//	int total =num1 *num2;
//System.out.println("total");

//강사님 풀이 
package loop;

import java.util.Scanner;

public class Test10구구단 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		//주어진 숫자에 따른 구구단 출력
		
		//입력
		
		System.out.println("원하는 구구단 : ");
		int dan =sc.nextInt();	
		//출력
		//System.out.println(dan+" X 1 = "); [1]다 쓰는 방법
		
		//반복문
		System.out.println(dan+"단 시작!");
		for(int i =1; i <=9; i++) {
			System.out.print(dan +" X "+ i +" = ");// 문제를 보여주고 답을 받아야함 //print 를 써서 옆에 답 받기
			int user =sc.nextInt(); //사용자 입력
			
			int answer =dan *i;
			if (user ==answer ) {//정답이라면
				System.out.println("정답!");
			}
			else {//오답이라면
				System.out.println("땡!");
			}
		}
		System.out.println("게임 오버!");
	}
}