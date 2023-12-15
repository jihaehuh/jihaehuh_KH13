/*
 * Test06배열섞기
Test05와 동일한 데이터를 배열에 저장하고 다음 규칙에 따라 데이터를 섞어보세요

-실행할 때마다 다른 위치로 바뀌도록 섞고 싶음
-배열의 모든 자리가 1번은 반드시 바뀌어야함
-바뀌는 자리가 같은 자리여도 상관없음
-모든 자리가 교체된 후 배열을 출력
 */
/*package array2;

import java.util.Random;

public class Test06배열섞기 {
	public static void main(String[]args) {
			Random r =new Random();  //랜덤으로 돌리기
			
			
				//배열준비
				int []numbers = new int [] {30,50,20,10,40};
				
				for(int i =0;  i <4; i++) {  
					int number = r.nextInt(4);
					System.out.println("arr="+number); 	
			}
				int backup =numbers[0];
				numbers[0] =numbers[3];
				numbers[3] =backup;
				
				System.out.println(numbers[0]);
				System.out.println(numbers[1]);
				System.out.println(numbers[2]);
				System.out.println(numbers[3]);
				System.out.println(numbers[4]);
		}
	}
*/

/*
package array2;

import java.util.Random;

public class Test06배열섞기 {
	public static void main(String[]args) {
			Random r =new Random();
			//프로그램이 어려워지면 난이도를 떨어뜨려라...
			int []numbers = new int [] {30,50,20,10,40};
			//맨 앞자리(+0지점)를 랜덤한 위치와 변경
			int index = r.nextInt(5);//0부터 5개_0부터 4까지
			System.out.println("index = "+index);
			
			//교체 (swp)=[0] 과[index]를 교체
			int backup =numbers[0];
			numbers[0] =numbers[index];
			numbers[index] =backup;
			
			//출력
			for(int i=0; i <numbers.length; i++) {
				System.out.println(numbers[i]);
			}
			
*/
package array2;

import java.util.Random;

public class Test06배열섞기 {
	public static void main(String[]args) {
			
			//프로그램이 어려워지면 난이도를 떨어뜨려라...
			int []numbers = new int [] {30,50,20,10,40};
		
			Random r =new Random();
			
			for(int i =0;  i <numbers.length; i++) {  
				//맨 앞자리(+0지점)를 랜덤한 위치와 변경 
				int index = r.nextInt(numbers.length);//0부터 5개_0부터 4까지
				System.out.println("index = "+index);
				
				//교체 (swp)=[1] 과[index]를 교체
				int backup =numbers[i];
				numbers[i] =numbers[index];
				numbers[index] =backup;
		}
			
			
			//출력
			for(int i=0; i <numbers.length; i++) {
				System.out.println(numbers[i]);
			}
			
			
			
			

			
			
			
			
			
			
			
			
			
			
	}
}