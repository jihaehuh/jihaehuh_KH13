/*
 * 
Test03로또번호카운트
KH로또연구소에서는 가장 많이 나오는 로또번호가 몇번인지 알고 싶어서 시뮬레이션을 진행하려고 합니다.

로또번호를 1000번정도 추첨해서 각각 나온 횟수를 저장하려고 합니다.

번호별로 나온 횟수를 출력
가장 많이 나온 번호를 출력(동점이면 아무거나)

 */

//[1]
/*
package array2;

import java.util.Random;

public class Test03로또번호카운트 {
	public static void main(String[]args) {
				
		//로또가 아니라 주사위를 10번 던진다고 가정하기
		//- 주사위 내역은 저장의 대상이 아님
		
		Random r =new Random();
		//숫자를 저장하려면 변수 6개를 만들던가 배열을 6자리 만들기
		int count1 =0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		
		//for (int i=1; i<=10; i++) {
			for(int i =0; i <10; i++) {
				int number = r.nextInt(6)+1;
				System.out.println("number ="+number);
				
				if(number ==1) {
					count1++;
				}
				else if(number ==2) {
					count2++;
				}
				else if(number ==3) {
					count3++;
				}
				else if(number ==4) {
					count4++;
				}
				else if(number ==5) {
					count5++;
				}
				else if(number ==6) {
					count6++;
				}
		}
			System.out.println("1이 나온 회수 = "+count1);
			System.out.println("2이 나온 회수 = "+count2);
			System.out.println("3이 나온 회수 = "+count3);
			System.out.println("4이 나온 회수 = "+count4);
			System.out.println("5이 나온 회수 = "+count5);
			System.out.println("6이 나온 회수 = "+count6);
			
			
		
				
	}
}
*/

/*
package array2;

import java.util.Random;

public class Test03로또번호카운트 {
	public static void main(String[]args) {
				
		//로또가 아니라 주사위를 10번 던진다고 가정하기
		//- 주사위 내역은 저장의 대상이 아님
		
		Random r =new Random();
		//숫자를 저장하려면 변수 6개를 만들던가 배열을 6자리 만들기
		int[] counts= new int[5];;
		
		//for (int i=1; i<=10; i++) {
			for(int i =0; i <10; i++) {
				int number = r.nextInt(6)+1;
				System.out.println("number ="+number);
				
				counts[number-1]++;   //1이 나오면[0]증가, 2나오면[1]증가 .....
				//counts= 1 ,[number-1]이 [0]  부분 
				
		}
			for(int i=0; i <=5; i++) {   //출력을 반복문으로 만들기
				System.out.println((i+1)+" 나온 회수 = "+counts[i]);
			}
			
				
	}
}

*/

//로또로 바꾸면
/*
package array2;

import java.util.Random;

public class Test03로또번호카운트 {
	public static void main(String[]args) {
				
		//로또가 아니라 주사위를 10번 던진다고 가정하기
		//- 주사위 내역은 저장의 대상이 아님
		
		Random r =new Random();
		//숫자를 저장하려면 변수 6개를 만들던가 배열을 6자리 만들기
		int[] counts= new int[45];;
		
		//for (int i=1; i<=1000; i++) {
			for(int i =0; i <1000; i++) {
				int number = r.nextInt(45)+1;
				System.out.println("number ="+number);
				
				counts[number-1]++;   //1이 나오면[0]증가, 2나오면[1]증가 .....
				//counts= 1 ,[number-1]이 [0]  부분 
				
		}
			for(int i=0; i < counts.length; i++) {   //출력을 반복문으로 만들기
				System.out.println((i+1)+" 나온 회수 = "+counts[i]);
			}
			
				
	}
}
*/
//가장 많이 나온 횟수 구하기 (최댓값)
package array2;

import java.util.Random;

public class Test03로또번호카운트 {
	public static void main(String[]args) {
			
		Random r =new Random();
		
		int[] counts= new int[45];;
		
	
			for(int i =0; i <1000; i++) {
				int number = r.nextInt(45)+1;
				System.out.println("number ="+number);
				
				counts[number-1]++;  
		}
			//최대값의 위치(index)를 찾자!
			int max =0;
			for(int i=1; i <counts.length; i++) { // 그 다음부터 마지막 까지 조회하며
				if(counts[max] < counts[i]) {// 내가 아는 최대값 보다 더 큰게 나타난다면
					max =i;
				}
			}
			//1
			for(int i=0; i < counts.length; i++) {   
				System.out.println((i+1)+" 나온 회수 = "+counts[i]);
			}
			//2
			System.out.println("가장 많이 나온 수 "+(max+1));  //동점으로 나오게된다면?
			
			//동점까지 출력
			for(int i=0; i<counts.length;i++) {
				if(counts[max] ==counts[i] ){//가장많이 나온 횟수랑 같은 칸이 있다면
					System.out.println("가장 많이 나온 수 " + (i + 1) + "("+counts[i]+"번)");
				}
			}
	}
}