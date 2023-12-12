/*
 * Test03등급판정
사용자에게 10개의 시험점수를 입력받아서 A등급과 B등급의 개수를 출력

A등급은 85점 이상 100점 이하
B등급은 70점 이상 85점 미만
 */
/*
package loop2;

import java.util.Scanner;

public class Test03등급판정 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int Acount =0;
		int Bcount =0;
		for (int i =1; i <=10; i++) {
			System.out.println("점수를 입력하세요 : ");
			int score =sc.nextInt();	
			if(score >=85) {
				System.out.println("A등급");
				Acount++;
			}
			else if(score >=70) {
					System.out.println("B등급");
					 Bcount++;
			}
		}
		int count=Acount +Bcount;
		System.out.println("A개수 : "+Acount +"개");
		System.out.println("B개수 : "+ Bcount +"개");		
		System.out.println("총 개수: "+ count +"개");		
	}
}
*/
//강사님 풀이 
package loop2;

import java.util.Scanner;

public class Test03등급판정 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int countA =0; //count는 count만큼 변수로 만들어져야함
		int countB =0;
		
		//for(int i=1; i<=10; i++){
		for(int i=0; i<=10; i++){
			System.out.println("시험점수 : ");
			int score =sc.nextInt();
			if(score >= 85) {
				System.out.println("A등급");
				countA++;
			}
			else if(score >=70) {
				System.out.println("B등급");
				countB++;
			}
			
			}
			System.out.println("A등급"+ countA+"개");
			System.out.println("B등급"+ countB+"개");
	}
}



