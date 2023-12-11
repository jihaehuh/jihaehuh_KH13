package loop;

import java.util.Scanner;

public class Test02이름 {
	static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		int name= sc.nextInt();
		for(int i=1; i <=5; i =i+1 ) {
		System.out.println(name+"님 환영합니다");
		}
	}
}
