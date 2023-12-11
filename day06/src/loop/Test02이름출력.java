package loop;

import java.util.Scanner;

public class Test02이름출력 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1 ; i <=5; i=i+1) {
			System.out.print("이름 : ");
			String name= sc.next();
			System.out.println(name+"님 환영합니다.");
			
		}
	}
}
