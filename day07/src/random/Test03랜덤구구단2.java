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

/*
package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단2 {
	public static void main(String[]args) {
		
		Random r = new Random();
		Scanner sc=new Scanner(System.in);
		
		
		int left = r.nextInt(18)+2;//2부터 18개 // 2부터 19 사이;
		int right =r.nextInt(9)+1;// 1부터 9개  //1부터 9사이;
		
		System.out.println(left +" X "+ right+" = ");
		int user =sc.nextInt();
		
		//정답인지 오답인지 
		if(user == left * right) {//정답이라면
			System.out.println("정답! ");
			
		}
		else {//오답이라면
			System.out.println("오답! ");
		}
		
		
	}
}
*/

/*
package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단5 {
	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int size = 10;
		int correct = 0;

		for(int i=1; i <= size; i++) {
			int left = r.nextInt(18) + 2;//2부터 18개//2부터 19사이
			int right = r.nextInt(9) + 1;//1부터 9개//1부터 9사이

			System.out.print(left + " x " + right + " = " );
			int user = sc.nextInt();

			if(user == left * right) {//정답이라면
				//System.out.println("정답!");
				correct++;
			}
			else {//오답이라면
				//System.out.println("오답!");
			}
		}


		System.out.println("게임 끝!");
		System.out.println("총 정답 개수 : " + correct);

	}
}
*/
/*
package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단6 {
	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int size = 10;
		int correctEasy = 0, correctDifficult = 0;//개수
		int score = 0;//점수

		for(int i=1; i <= size; i++) {
			int left = r.nextInt(18) + 2;//2부터 18개//2부터 19사이
			int right = r.nextInt(9) + 1;//1부터 9개//1부터 9사이

			System.out.print(left + " x " + right + " = " );
			int user = sc.nextInt();

			if(user == left * right) {//정답이라면

				//어려운 문제라면 - 12단 이상이면서 x2 이상
				if(left >= 12 && right >= 2) {
					//System.out.println("어려운 문제 클리어");
					correctDifficult++;
					score += 15;
				}
				//쉬운 문제라면 - 11단 이하이거나 x1인 경우
				else {
					//System.out.println("쉬운 문제 클리어");
					correctEasy++;
					score += 10;
				}

			}
		}


		System.out.println("게임 끝!");
		System.out.println("쉬운 문제 정답 개수 : " + correctEasy);
		System.out.println("어려운 문제 정답 개수 : " + correctDifficult);
		System.out.println("총 획득 점수 : " + score+"점");

	}
}
*/

/*

package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단7 {
	public static void main(String[] args) {
		//콤보도 결국 카운트
		//- 정답을 맞추면 1 증가
		//- 틀리면 0

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int size = 10;
		int combo = 0;

		for(int i=1; i <= size; i++) {
			int left = r.nextInt(18) + 2;//2부터 18개//2부터 19사이
			int right = r.nextInt(9) + 1;//1부터 9개//1부터 9사이

			System.out.print(left + " x " + right + " = " );
			int user = sc.nextInt();

			if(user == left * right) {//정답이라면
				combo++;
			}
			else {//오답이라면
				combo = 0;
			}
			System.out.println("combo = " + combo);
		}


		System.out.println("게임 끝!");

	}
}
*/

package random;

import java.util.Random;
import java.util.Scanner;

public class Test03랜덤구구단2 {
	public static void main(String[] args) {
		//콤보도 결국 카운트
		//- 정답을 맞추면 1 증가
		//- 틀리면 0

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int size = 10;
		int combo = 0;

		for(int i=1; i <= size; i++) {
			int left = r.nextInt(18) + 2;//2부터 18개//2부터 19사이
			int right = r.nextInt(9) + 1;//1부터 9개//1부터 9사이

			System.out.print(left + " x " + right + " = " );
			int user = sc.nextInt();

			if(user == left * right) {//정답이라면
				combo++;
				if(combo >= 2) {
					System.out.println(combo + " Combo!");
				}
			}
			else {//오답이라면
				combo = 0;
			}
		}


		System.out.println("게임 끝!");

	}
}