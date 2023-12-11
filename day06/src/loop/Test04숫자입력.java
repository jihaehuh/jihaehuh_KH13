/*
 * Test04숫자입력
사용자에게 7개의 숫자를 입력받아서 출력

1번째 숫자 입력 : 23
입력하신 숫자는 "23" 입니다.

2번째 숫자 입력 : 15
입력하신 숫자는 "15" 입니다.

...(반복)...
 */
//
package loop;

import java.util.Scanner;

public class Test04숫자입력 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		//for(int i =1; i <=7 ; i =i+1)
		//for(int i =1; i <=7 ; i +=1)
		for(int i =1; i <=7 ; i ++){
			System.out.print(i+"번 째 숫자 입력 : ");
			String num= sc.next();
			System.out.println("입력하신 숫자는 \"" + num + "\"입니다.");
		}
	}
}
