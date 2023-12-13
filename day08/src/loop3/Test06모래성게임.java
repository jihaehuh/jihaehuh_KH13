package loop3;

import java.util.Scanner;

public class Test06모래성게임 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 100;
		
		System.out.println("현재 남은 숫자 : " + number);
		System.out.print("가져갈 숫자(1~9) 입력 : ");
		int user = sc.nextInt();
		
		number -= user;
		
		System.out.println("현재 남은 숫자 : " + number);
		
	}
}
/*
package loop3;

import java.util.Scanner;

public class Test06모래성게임2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 100;
		
		while(true) {
			System.out.println("현재 남은 숫자 : " + number);
			System.out.print("가져갈 숫자(1~9) 입력 : ");
			int user = sc.nextInt();
			
			number -= user;
		}
		
		
	}
}

*/
/*
package loop3;

import java.util.Scanner;

public class Test06모래성게임3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 100;
		
		while(true) {
			System.out.println("현재 남은 숫자 : " + number);
			System.out.print("가져갈 숫자(1~9) 입력 : ");
			int user = sc.nextInt();
			
			number -= user;
			
			//종료조건 - 더이상 남은 숫자가 없다면
			if(number <= 0) {
				break;
			}
		}
		
		System.out.println("당신은 패배했습니다");
		
	}
}
*/