package IO;

import java.util.Scanner;

public class Test04평균계산기 {
	public static void main(String[]args) {
		//입력
		Scanner sc =new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");     
		double korean =sc.nextInt();              //double 로 하면 소수점 까지 나올수 있
		System.out.println("영어점수를 입력하세요");
		double english=sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		//System.out.print("수학점수: ");
		double math=sc.nextInt();
		
		
		//출력
		double total =(korean+english+math);
		System.out.println("총점은 "+total);
		double average=total /3;
		System.out.println("평균은 "+average);
		
		
		
		
		
		
		
		
		
	}
}