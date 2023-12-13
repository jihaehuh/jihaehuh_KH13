package loop3;

import java.util.Random;

public class Test04업다운게임 {
	public static void main(String[] args) {
		
		//1회의 업다운 게임
		Random r = new Random();
		
		//컴퓨터의 정답 생성
		//- 1부터 1000까지 = 1부터 1000개
		int answer = r.nextInt(1000) + 1;
		System.out.println("answer = " + answer);
		
		//사용자의 정답 입력 및 판정
		
	}
}

/*
package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04업다운게임 {
	public static void main(String[] args) {
		
		//1회의 업다운 게임
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터의 정답 생성
		//- 1부터 1000까지 = 1부터 1000개
		int answer = r.nextInt(1000) + 1;
		System.out.println("answer = " + answer);
		
		//사용자의 정답 입력 및 판정
		System.out.print("정답 입력 : ");
		int user = sc.nextInt();
		
		
	}
}
*/

/*
package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04업다운게임3 {
	public static void main(String[] args) {
		
		//1회의 업다운 게임
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터의 정답 생성
		//- 1부터 1000까지 = 1부터 1000개
		int answer = r.nextInt(1000) + 1;
		System.out.println("answer = " + answer);
		
		//사용자의 정답 입력 및 판정
		System.out.print("정답 입력 : ");
		int user = sc.nextInt();
		
		if(user == answer) {
			System.out.println("정답");
		}
		else if(user > answer) {//정답이 더 작은 숫자면
			System.out.println("다운");
		}
		else {//정답이 더 큰 숫자면
			System.out.println("업");
		}
	}
}
*/
/*
package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04업다운게임4 {
	public static void main(String[] args) {
		
		//1회의 업다운 게임
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		//컴퓨터의 정답 생성
		//- 1부터 1000까지 = 1부터 1000개
		int answer = r.nextInt(1000) + 1;
		//System.out.println("answer = " + answer);
		System.out.println("컴퓨터가 1~1000 사이에서 숫자를 하나 만들었습니다");
		
		while(true) {
			//사용자의 정답 입력 및 판정
			System.out.print("정답 입력 : ");
			int user = sc.nextInt();
			
			if(user == answer) {
				System.out.println("정답");
				break;
			}
			else if(user > answer) {//정답이 더 작은 숫자면
				System.out.println("다운");
			}
			else {//정답이 더 큰 숫자면
				System.out.println("업");
			}
		}
	}
}
*/
/*
package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04업다운게임5 {
	public static void main(String[] args) {
		
		//1회의 업다운 게임
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		//컴퓨터의 정답 생성
		//- 1부터 1000까지 = 1부터 1000개
		int answer = r.nextInt(1000) + 1;
		//System.out.println("answer = " + answer);
		System.out.println("컴퓨터가 1~1000 사이에서 숫자를 하나 만들었습니다");
		
		int count = 0;
		
		while(true) {
			//사용자의 정답 입력 및 판정
			System.out.print("정답 입력 : ");
			int user = sc.nextInt();
			
			count++;
			
			if(user == answer) {
				System.out.println("정답");
				break;
			}
			else if(user > answer) {//정답이 더 작은 숫자면
				System.out.println("다운");
			}
			else {//정답이 더 큰 숫자면
				System.out.println("업");
			}
		}
		
		System.out.println("총 "+count+"번 만에 맞추셨습니다");
		
	}
}
*/