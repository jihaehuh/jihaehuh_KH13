/*
 * Test02학점계산기
KH대학교에서는 다음 기준에 따라 학점을 계산합니다.
(시험은 100점이 만점입니다)

90점 이상 100점 이하라면 A+
80점 이상 90점 미만이라면 A
70점 이상 80점 미만이라면 B
60점 이상 70점 미만이라면 C
나머지는 F

시험점수를 입력받아 등급이 출력되도록 프로그래밍 해보세요

if구문이 아닌 switch구문으로 풀어보세요
 */

/*
package condition3;

import java.util.Scanner;

public class Test02학점계산기 {
	public static void main(String[]args) {
		// 입력 
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score= sc.nextInt();

		int grade = score/10;
		
		switch(grade) {
		case 10 : 
			System.out.println("A+");
			break;
		case 9 : 
			System.out.println("A+");
			break;
		case 8 :
			System.out.println("A");
			break;
		case 7 :
			System.out.println("B");
			break;
		case 6 :
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		break;
		}
	}
}
*/
//강사님 설명
package condition3;

import java.util.Scanner;

public class Test02학점계산기 {
	public static void main(String[]args) {
		// 입력 
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score= sc.nextInt();
	
		int ten =score/10;
		int grade =ten*10;
		//출력
		
		switch (grade){//좋은 풀이는 아님.
		//case 90:case 91: case 92: case 93:case 94:case 95:case 96:
		//case 97:case 98:case 99:case 100:
		case 90,100:
			System.out.println("A+ ");
			break;
		//자바 13이상부터는 , 사용이 가능하다
			case 89,88,87,86,85,84,83,82,81,80:
			System.out.println("A");
			break;
			case 7:
				System.out.println("B");
			case 6 :
				System.out.println("C");
				break;
			case 5 :
				System.out.println("D");
			default:
				System.out.println("F");
			break;
			
			//System.out.println("당신의 학점은 :"+ grade );
		}
	}
}


