package loop3;

import java.util.Scanner;

public class Test05베스킨라빈스31 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 1;
		
		System.out.println("현재 차례 : " + number);
		System.out.print("개수(1~3) 입력 : ");
		int user = sc.nextInt();
		
		number += user;
		
		System.out.println("현재 차례 : " + number);
	}
}
/*
*package loop3;

import java.util.Scanner;

public class Test05베스킨라빈스312 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 1;
		
		while(true) {
			System.out.println("현재 차례 : " + number);
			System.out.print("개수(1~3) 입력 : ");
			int user = sc.nextInt();
			
			number += user;
			
			if(number > 31) {
				break;
			}
		}
		
		System.out.println("당신은 패배하였습니다");
		
	}
}

*/

/*
package loop3;

import java.util.Scanner;

public class Test05베스킨라빈스313 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 1;
		
		while(true) {
			System.out.println("현재 차례 : " + number);
			System.out.print("개수(1~3) 입력 : ");
			int user = sc.nextInt();
			
			//사용자가 선택한 숫자 개수에 따른 멘트 출력
			for(int i=0; i < user; i++) {
				System.out.print(number + i);
				System.out.print("\t");
			}
			System.out.println("선택");
			
			number += user;
			
			if(number > 31) {
				break;
			}
		}
		
		System.out.println("당신은 패배하였습니다");
		
	}
}
*/
/*
 * package loop3;

import java.util.Scanner;

public class Test05베스킨라빈스314 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 1;
		
		while(true) {
			System.out.println("현재 차례 : " + number);
			System.out.print("개수(1~3) 입력 : ");
			int user = sc.nextInt();
			
			//만약에 사용자가 1~3이 아닌 수를 입력했다면 건너뛰고 다시시작
			//if(user < 1 || user > 3) {}
			if(!(user >= 1 && user <= 3)) {
				continue;
			}
			
			//사용자가 선택한 숫자 개수에 따른 멘트 출력
			for(int i=0; i < user; i++) {
				System.out.print(number + i);
				System.out.print("\t");
			}
			System.out.println("선택");
			
			number += user;
			
			//숫자를 증가시켰을 때 31보다 크다면 31을 말한것과 같다
			if(number > 31) {
				break;
			}
		}
		
		System.out.println("당신은 패배하였습니다");
		
	}
}

 */
